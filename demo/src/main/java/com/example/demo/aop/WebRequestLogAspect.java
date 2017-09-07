//package com.example.demo.aop;
//
//import com.alibaba.fastjson.JSON;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//import org.springframework.web.servlet.HandlerMapping;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.Map;
//
///**
// * Created  at 2017/9/6.
// */
//@Aspect
//@Component
//public class WebRequestLogAspect {
//
//    private static Logger logger = LoggerFactory.getLogger(WebRequestLogAspect.class);
//
//    private ThreadLocal<String> paramsStr = new ThreadLocal<String>();
//
//    @Pointcut("execution(* com.example.demo..controller..*Controller.*(..))")
//    public void webRequestLog() {}
//
//    // @Order(5)
//    @Before("webRequestLog()")
//    public void doBefore(JoinPoint joinPoint) {
//        try {
//
//            long beginTime = System.currentTimeMillis();
//
//            // 接收到请求，记录请求内容
//            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//            HttpServletRequest request = attributes.getRequest();
//            String beanName = joinPoint.getSignature().getDeclaringTypeName();
//            String methodName = joinPoint.getSignature().getName();
//            String uri = request.getRequestURI();
//            String remoteAddr = getIpAddr(request);
//            String sessionId = request.getSession().getId();
//            String user = (String) request.getSession().getAttribute("user");
//            String method = request.getMethod();
//            String params = "";
//            if ("POST".equals(method)) {
//                Object[] paramsArray = joinPoint.getArgs();
//                params = argsArrayToString(paramsArray);
//            } else {
//                Map<?, ?> paramsMap = (Map<?, ?>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
//                params = paramsMap.toString();
//            }
//            paramsStr.set(params);
//            logger.debug("uri=" + uri + "; beanName=" + beanName + "; remoteAddr=" + remoteAddr + "; user=" + user
//                    + "; methodName=" + methodName + "; params=" + params);
//        } catch (Exception e) {
//            logger.error("***操作请求日志记录失败doBefore()***", e);
//        }
//    }
//
//
//    @Around("webRequestLog()")
//    public void around(ProceedingJoinPoint pjp) throws  Throwable{
//
//        pjp.proceed();
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        String ss=  paramsStr.get();
//         attributes.getResponse().getWriter().write(ss);
//    }
//
//
//    /**
//     * 获取登录用户远程主机ip地址
//     *
//     * @param request
//     * @return
//     */
//    private String getIpAddr(HttpServletRequest request) {
//        String ip = request.getHeader("x-forwarded-for");
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("Proxy-Client-IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("WL-Proxy-Client-IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getRemoteAddr();
//        }
//        return ip;
//    }
//
//    /**
//     * 请求参数拼装
//     *
//     * @param paramsArray
//     * @return
//     */
//    private String argsArrayToString(Object[] paramsArray) {
//        String params = "";
//        if (paramsArray != null && paramsArray.length > 0) {
//            for (int i = 0; i < paramsArray.length; i++) {
//                Object jsonObj = JSON.toJSON(paramsArray[i]);
//                params += jsonObj.toString() + " ";
//            }
//        }
//        return params.trim();
//    }
//
//}