package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {

	
	@Before("execution(* com.example.service.*.*(..)) ")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("########## BeforeAdvice Method Called #########"+joinPoint.getSignature());
	}

	@After("execution(* com.example.service.*.*(..)) ")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("########## afterAdvice Method Called #########"+joinPoint.getSignature());
	}
	
	
}
