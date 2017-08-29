package com.example.demo.model;



public class ResponseStatus {
	
	private String code;
	private String msg;

	
	public ResponseStatus(){}
	
	public ResponseStatus(String code) {
		super();
		this.code = code;
	}
	
	public ResponseStatus(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
