package com.example.emailsender.service.impl;

import java.text.DecimalFormat;
import java.util.Random;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.emailsender.service.EmailSenderService;

@Service
public class EmailSenderServiceImpl implements EmailSenderService {

	String otp;
	String email;

	private final JavaMailSender mailSender;

	public EmailSenderServiceImpl(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void generateOTP(String email) {
		String otp = new DecimalFormat("000000").format(new Random().nextInt(999999));
		this.otp = otp;
		this.email = email;
		System.err.println("Generate" + this.otp);
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom("DO NOTREPLY");
		simpleMailMessage.setTo(email);
		simpleMailMessage.setSubject("OTP Generation Successfull");
		simpleMailMessage.setText("<h3> Hello OTP is generated please validate the OTP " + otp
				+ " and it is valid for only 30 Seconds. </h3>");
		this.mailSender.send(simpleMailMessage);
	}

	@Override
	public String validateOTP(String OTP) {
		String message = null;
		if (this.otp != null) {
			if (this.otp.equalsIgnoreCase(OTP)) {
				message = "Loggined Successfull";
				SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
				simpleMailMessage.setFrom("javadev.darshit@gmail.com");
				simpleMailMessage.setTo(email);
				simpleMailMessage.setSubject("Loggined Successfull");
				simpleMailMessage.setText("Hey " + email + " you have Loggined Successfully...!!!");
				this.mailSender.send(simpleMailMessage);
			} else {
				message = "Loggined Failed";
				this.otp = null;
				SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
				simpleMailMessage.setFrom("javadev.darshit@gmail.com");
				simpleMailMessage.setTo(email);
				simpleMailMessage.setSubject("Loggined Failed");
				simpleMailMessage.setText("Hey " + email + " Loggined failed please regenerate the OTP...!!!");
				this.mailSender.send(simpleMailMessage);

			}
		} else {
			message = "Please Regenerate the OTP";
		}
		return message;
	}

	@Override
	public void sendEmail(String to, String subject, String message) {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom("javadev.darshit@gmail.com");
		simpleMailMessage.setTo(to);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(message);
		this.mailSender.send(simpleMailMessage);
	}
}
