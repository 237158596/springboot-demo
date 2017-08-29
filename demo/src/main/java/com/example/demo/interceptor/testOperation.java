package com.example.demo.interceptor;

import java.lang.annotation.*;

/**
 * Created  at 2017/8/29.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface testOperation {

    String code();
}
