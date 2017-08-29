package com.example.demo.exception;

/**
 * 定制化错误描述
 * 错误code固定
 * Created by fuhong on 15/10/29.
 */
public class CustomError implements BaseError{

    private String code;

    private String des;

    public CustomError(String des){
        this.code = "900000";
        this.des = des;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDes() {
        return des;
    }

}
