package com.example.demo.webInterceptor;

import com.alibaba.fastjson.JSON;
import com.example.demo.model.Result;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * 拦截器
 * 1.未登陆状态根据白名单进行拦截
 * 2.表单数据重复提交拦截
 * 3.指定间隔时间内多次提交拦截
 * <p>
 *
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginInterceptor.class);

    public static final String FROM_RE_SUBMIT_KEY = "form_re_submit_key";

    private static final String INTERVAL_KEY = "interval_";

    private List<String> excludedUrls;

    public void setExcludedUrls(List<String> excludedUrls) {
        this.excludedUrls = excludedUrls;
    }

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        String requestUri = request.getRequestURI();

        /* 过滤掉swagger api 请求*/
        if (requestUri.contains("swagger-ui.html") || requestUri.contains("webjars/springfox-swagger-ui")
                || requestUri.contains("api-docs") || requestUri.contains("swagger-resources")) {
            return true;
        }

        /* 过滤监控请求 */
        if (requestUri.contains("/actuator")) {
            return true;
        }

        /* 1. 不需要登陆的页面 */
        if(!CollectionUtils.isEmpty(excludedUrls)) {
            for (String url : excludedUrls) {
                if (requestUri.endsWith(url)) {
                    return true;
                }
            }
        }
        /* 2. 是否登陆, 未登陆则返回提示 */
        String ssoToken = request.getHeader("X_SSO_TOKEN");
        if (!StringUtils.isBlank(ssoToken)) {
            return redirect(response);
        }
//        UserInfoCache userInfoCache = (UserInfoCache) redisUtil.get(ssoToken);
//        if (userInfoCache == null || StringUtils.isBlank(userInfoCache.getUsername())) {
//            return redirect(response);
//        }

        if (!HandlerMethod.class.equals(handler.getClass())) {
            return true;
        }
        HandlerMethod handler2 = (HandlerMethod) handler;

        return true;
    }


    private boolean redirect(HttpServletResponse response) throws IOException {
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().write(JSON.toJSONString(new Result("no login ")));
        return false;
    }


}