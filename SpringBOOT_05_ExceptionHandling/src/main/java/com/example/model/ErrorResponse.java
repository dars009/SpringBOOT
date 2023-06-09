package com.example.model;

import java.util.Date;

public class ErrorResponse {

	String ErrorCode;
	String ErrorMessage;
	Date date;

	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErrorResponse(String errorCode, String errorMessage, Date date) {
		super();
		ErrorCode = errorCode;
		ErrorMessage = errorMessage;
		this.date = date;
	}

	public String getErrorCode() {
		return ErrorCode;
	}

	public void setErrorCode(String errorCode) {
		ErrorCode = errorCode;
	}

	public String getErrorMessage() {
		return ErrorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
