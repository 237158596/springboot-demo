package com.example.demo.exception;

/**
 *
 * 程序错误, 日志级别为error, 需要开发干预
 *
 * Created by aaron on 15/6/23.
 */
public class BizException extends TipException {

    /**
     *
     * @param message 描述信息, 一般会记录输入参数
     * @param error   提示代码
     */
    public BizException(String message, BaseError error) {
        super(message, error);
    }

    /**
     *
     * @param message 描述信息, 一般会记录输入参数
     * @param cause   引发的异常
     * @param error   提示代码
     */
    public BizException(String message, Throwable cause, BaseError error) {
        super(message, cause, error);
    }

}
