package com.example.ExceptionUtil;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExcecptionHandler {

	@ExceptionHandler(value = EmployeeNotFoundException.class)
	public ResponseEntity<Object> exception(EmployeeNotFoundException exception){
		return new ResponseEntity<Object>(exception.getErrorMessage(), HttpStatus.NOT_FOUND);
		
	}
	
	
}
