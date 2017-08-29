package com.example.demo.exception;

/**
 *
 * 用户提示, 日志级别为warn, 当出现此类异常时候, 不需要开发介入
 *
 * Created by fuhong on 16/5/18.
 */
public class TipException extends RuntimeException {
	private static final long serialVersionUID = -4588378191533057628L;
	
	/* 提示代码 */
    protected final BaseError error;

    /**
     *
     * @param error 提示代码
     */
    public TipException(BaseError error) {
        this(error.getDes(), null, error);
    }

    /**
     *
     * @param message 描述信息, 一般会记录输入参数
     * @param error   提示代码
     */
    public TipException(String message, BaseError error) {
        this(message, null, error);
    }

    /**
     *
     * @param message 描述信息, 一般会记录输入参数
     * @param cause   引发的异常
     * @param error   提示代码
     */
    TipException(String message, Throwable cause, BaseError error) {
        super(message, cause);
        this.error = error;
    }

    public BaseError getError() {
        return this.error;
    }
}
