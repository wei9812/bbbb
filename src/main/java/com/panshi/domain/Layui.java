package com.panshi.domain;

import java.util.List;

public class Layui {
	
	private int code;
	
	private String msg="";
	
	private int count;
	
	private List<User> data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<User> getData() {
		return data;
	}

	public void setData(List<User> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Layui [code=" + code + ", msg=" + msg + ", count=" + count + ", data=" + data + "]";
	}
	
	
	
}
