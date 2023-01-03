package com.example.log4j2demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	private static final Logger logger = LogManager.getLogger(StudentController.class);

	@GetMapping("/getStudent")
	public String getStudents() {
		logger.info("Student Controller called");
		logger.debug("Student Debugging log");
		logger.info("Student Info log");
		logger.warn("Student Hey, This is a warning!");
		logger.error("Student Oops! We have an Error. OK");
		logger.fatal("Student Damn! Fatal error. Please fix me.");
		return "Hello Spring BOOT Application";
	}
}