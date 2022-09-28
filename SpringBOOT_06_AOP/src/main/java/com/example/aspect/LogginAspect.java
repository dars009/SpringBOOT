package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class LogginAspect {

	Logger logger = LoggerFactory.getLogger(LogginAspect.class);

	@Pointcut(value ="execution(* com.example.*.*.*(..) )")
	public void myPointcut() {
		
	}
	
	@Around("myPointcut()")
	public Object applicationLogger(ProceedingJoinPoint pjp) throws Throwable {
		
		ObjectMapper mapper = new ObjectMapper();
		
		// before method invocation
		String methodName = pjp.getSignature().getName();
		String className = pjp.getTarget().getClass().toString();
		Object[] arg = pjp.getArgs();
		logger.info("Method Invoke" + className + " : " + methodName+"() " + arg + mapper.writeValueAsString(arg));

		// for execute method 
		Object object = pjp.proceed();
		
		// after proceed method
		logger.info(className + " : " + methodName+"()  Response : " + mapper.writeValueAsString(object));
		return object;
	}
}
