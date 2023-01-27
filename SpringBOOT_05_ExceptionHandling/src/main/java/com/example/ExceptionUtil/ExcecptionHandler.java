package com.example.ExceptionUtil;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.model.ErrorResponse;

@ControllerAdvice
public class ExcecptionHandler {

	@ExceptionHandler(value = EmployeeNotFoundException.class)
	public ResponseEntity<ErrorResponse> exception(EmployeeNotFoundException exception){
		ErrorResponse errResp = new ErrorResponse();
		errResp.setErrorMessage(exception.getErrorMessage());
		errResp.setErrorCode(HttpStatus.NOT_FOUND.toString());
		errResp.setDate(new Date());
		//return new ResponseEntity<Object>(exception.getErrorMessage(), HttpStatus.NOT_FOUND);
		return new ResponseEntity<ErrorResponse>(errResp, HttpStatus.NOT_FOUND);	
	}
}
