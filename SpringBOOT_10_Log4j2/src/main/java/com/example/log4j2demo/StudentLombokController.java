package com.example.log4j2demo;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@CrossOrigin
public class StudentLombokController {

	@GetMapping("/getStudentLog4j")
	public String getStudents() {
		log.info("Using Lombok @Log4j2 annotation Student Controller called ");
		log.debug("Using Lombok @Log4j2 annotation Student Debugging log");
		log.info("Using Lombok @Log4j2 annotation Student Info log");
		log.warn("Using Lombok @Log4j2 annotation Student Hey, This is a warning!");
		log.error("Using Lombok @Log4j2 annotation Student Oops! We have an Error. OK");
		log.fatal("Using Lombok @Log4j2 annotation Student Damn! Fatal error. Please fix me.");
		return "Hello Spring BOOT Application";
	}
}