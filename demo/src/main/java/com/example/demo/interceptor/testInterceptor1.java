package com.example.demo.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created  at 2017/8/29.
 */
@Component
@Aspect()
@Order(1)
public class testInterceptor1 {

    private static final Logger logger = LoggerFactory.getLogger(testInterceptor1.class);

    /**
     * 切入点
     */
    @Pointcut("execution(* com.example.demo..services..*Service.*(..))")
    public void point() {
        //Do nothing
    }

    @Before(value = "point()")
    public void before(JoinPoint joinPoint) {
        logger.info("testInterceptor1...before... ");
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();

    }


}
