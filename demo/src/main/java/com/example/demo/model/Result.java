package com.example.demo.model;


import com.example.demo.exception.BaseError;
import com.example.demo.webInterceptor.PerformanceInterceptor;
import org.slf4j.MDC;


public class Result<T> {

	private ResponseStatus responseStatus;
	private Body<T> body;
	
	public Result(){}
	
	public Result(ResponseStatus responseStatus) {
		super();
		this.responseStatus = responseStatus;
	}

	public Result(ResponseStatus responseStatus, Body<T> body) {
		super();
		this.responseStatus = responseStatus;
		this.body = body;
	}
	
	public Result(BaseError error) {
        ResponseStatus status = new ResponseStatus();
        status.setCode(error.getCode());
        String msg = error.getDes();
		String tuid = MDC.get(PerformanceInterceptor.TUID);
		if (tuid != null) {
			msg = String.format("%s(%s)", msg, tuid);
		}
		status.setMsg(msg);
        this.responseStatus = status;
	}

	public Result(String errorStr) {
		ResponseStatus status = new ResponseStatus();
		status.setCode("100001");
		status.setMsg(errorStr);
		this.responseStatus = status;
	}


	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}
	public Body<T> getBody() {
		return body;
	}
	public void setBody(Body<T> body) {
		this.body = body;
	}
	
	
}
