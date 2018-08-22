package com.arka.student.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {
	private int code;
	private String message;
	
	
	public ErrorMessage() {
		super();
	}
	public ErrorMessage(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
	
	

}
