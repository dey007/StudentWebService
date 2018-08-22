package com.arka.student.exception;

import javax.ws.rs.ext.Provider;

@Provider
public class DataNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DataNotFoundException(String msg) {
		super(msg);
	}
}
