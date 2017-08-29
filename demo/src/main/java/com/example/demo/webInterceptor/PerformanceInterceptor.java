package com.example.demo.webInterceptor;

import com.example.demo.utils.SessionContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.NamedThreadLocal;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created  at 2017/8/29.
 */
public class PerformanceInterceptor extends HandlerInterceptorAdapter {

    public static final String TUID = "tuid";

    public static final String USER = "username";

    private Logger log = LoggerFactory.getLogger(this.getClass());

    private NamedThreadLocal<Long> startTimeThreadLocal = new NamedThreadLocal<Long>("PerformanceInterceptor-StartTime");

    @Autowired
    private SessionContainer sessionContainer;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        MDC.put(TUID, Id.nextS());
//        UserInfoCache userInfoCache;
//        try {
//            userInfoCache = sessionContainer.getCurrentUser();
//            if (userInfoCache!= null && StringUtils.isNotBlank(userInfoCache.getUsername())){
//                MDC.put(USER,userInfoCache.getUsername());
//            }
//        } catch (Exception e) {
//            // do nothing
//        }

        long beginTime = System.currentTimeMillis();//1、开始时间
        startTimeThreadLocal.set(beginTime);//线程绑定变量（该数据只有当前请求的线程可见）

        if (!HandlerMethod.class.equals(handler.getClass())) {
            return true;
        }
        String ip;
        if (request.getHeader("x-forwarded-for") == null) {
            ip = request.getRemoteAddr();
        } else
            ip = request.getHeader("x-forwarded-for");
        log.info("=================请求IP:{},主机名:{}, URL:{}", ip, request.getLocalName(), request.getRequestURI());

        return true;

    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
        try {
            long endTime = System.currentTimeMillis();//2、结束时间
            long beginTime = startTimeThreadLocal.get();//得到线程绑定的局部变量（开始时间）
            long consumeTime = endTime - beginTime;//3、消耗的时间
            if (consumeTime > 500) {//此处认为处理时间超过500毫秒的请求为慢请求
                // 记录到日志文件
                log.info("======接口性能时间情况：{}", String.format("%s consume %d millis", request.getRequestURI(), consumeTime));
            }
        } finally {
            MDC.remove(USER);
            MDC.remove(TUID);
        }
    }


    private static class Id {

        private static Date date = new Date();

        private static int seq = 0;

        private static final int ROTATION = 99999;

        private Id() {

        }

        static String nextS() {
            return Long.toString(next(), 36);
        }

        private static synchronized long next(){
            if (seq > ROTATION) {
                seq = 0;
            }
            date.setTime(System.currentTimeMillis());
            String str = String.format("%1$tY%1$tm%1$td%1$tk%1$tM%1$tS%2$05d", date, seq++);
            str = str.substring(4);
            return Long.parseLong(str);
        }
    }
}
