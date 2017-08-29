package com.example.demo.model;

import java.util.List;


public class Body<T> {

	private T obj;
	private List<T> list;
	private Integer total;
	
	
	
	public Body(T obj) {
		
		this.obj = obj;
	}
	
	public Body() {
	}

	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
}
