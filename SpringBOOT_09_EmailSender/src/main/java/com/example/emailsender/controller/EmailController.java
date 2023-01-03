package com.example.emailsender.controller;

import com.example.emailsender.resource.EmailMessage;
import com.example.emailsender.service.EmailSenderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

	private final EmailSenderService emailSenderService;

	public EmailController(EmailSenderService emailSenderService) {
		this.emailSenderService = emailSenderService;
	}

	@PostMapping("/sendemail")
	public ResponseEntity sendEmail(@RequestBody EmailMessage emailMessage) {
		this.emailSenderService.sendEmail(emailMessage.getTo(), emailMessage.getSubject(), emailMessage.getMessage());
		return ResponseEntity.ok("Success");
	}

	@GetMapping(value = "GenerateOTP/{email}")
	public String generateOTP(@PathVariable String email) {
		emailSenderService.generateOTP(email);
		return "Success";

	}

	@GetMapping(value = "validateOTP/{OTP}")
	public String validateOTP(@PathVariable String OTP) {
		String message = emailSenderService.validateOTP(OTP);
		return message;

	}
}
