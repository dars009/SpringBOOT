package com.example.ExceptionUtil;


public class EmployeeNotFoundException extends RuntimeException{

	String errorMessage;
	
	public EmployeeNotFoundException(String ErrorMsg) {
		super();
		this.errorMessage=ErrorMsg;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
