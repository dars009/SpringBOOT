package com.example.emailsender.service;

public interface EmailSenderService {
	void sendEmail(String to, String subject, String message);

	public void generateOTP(String email);

	public String validateOTP(String OTP);
}
