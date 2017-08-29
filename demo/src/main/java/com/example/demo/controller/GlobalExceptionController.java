package com.example.demo.controller;

import com.example.demo.exception.CustomError;
import com.example.demo.model.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 创建全局异常处理类：通过使用@ControllerAdvice定义统一的异常处理类，而不是在每个Controller中逐个定义。
 *
 * @ControllerAdvice统一定义不同Exception映射到不同错误处理页面
 */
@ControllerAdvice
public class GlobalExceptionController {

    private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionController.class);
    /**
     * @ExceptionHandler用来定义函数针对的异常类型，最后将Exception对象和请求URL映射到error.html中
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result ErrorHandler(HttpServletRequest req, Exception ex) throws Exception {
        String errorMesssage = ex.getMessage();

        LOG.info("系统异常 ,error msg:{}", ex);
        return new Result(new CustomError(errorMesssage));
    }

}
