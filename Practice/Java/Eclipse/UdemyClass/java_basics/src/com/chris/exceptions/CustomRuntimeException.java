package com.chris.exceptions;

public class CustomRuntimeException extends Exception{

	private static final long serialVersionUID = 1L;

	public CustomRuntimeException(String message) {
		super(message);
	}
}
