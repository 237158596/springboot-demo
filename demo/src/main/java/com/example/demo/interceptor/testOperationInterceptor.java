package com.example.demo.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
@Order(2)
public class testOperationInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(testOperationInterceptor.class);


    @Before("@annotation(com.example.demo.interceptor.testOperation)")
    public void before(JoinPoint joinPoint) {
        logger.info("testOperationInterceptor...before... ");
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();

    }


}
