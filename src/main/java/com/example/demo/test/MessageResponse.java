package com.example.demo.test;

import lombok.Data;

@Data
public class MessageResponse<T> {

	private String success = Constant.SUCCESS;    //状态:success  or  fail
	private String msg;   //信息：成功 or 错误
	private T object;         //对象

	public MessageResponse(){
	}

	public MessageResponse(String success){
		this(success,null);
	}

	public MessageResponse(String success, T t){
		this(success,t,null);
	}

	public MessageResponse(String success, T t, String msg){
		this.success = success;
		this.msg = msg;
		this.object = t;
	}
	
}
