package com.example.demo.exception;



public enum ErrorEnum implements BaseError {

    /**
     * 公共异常，10开头
     */
    SYS_ERROR("100000", "Hi，此处遇到问题，请联系Helpdesk处理,截图哦"),
    FAILURE_NOTICE("100004", "短信发送失败"),
    INVALID_PARAMTER("100001", "非法参数");

    private String code;
    private String des;

    ErrorEnum(String code, String des) {
        this.code = code;
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

    @Override
    public String toString() {
        return "ErrorEnum{" +
                "code='" + code + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}

