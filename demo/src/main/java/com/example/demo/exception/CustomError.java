package com.example.demo.exception;


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
