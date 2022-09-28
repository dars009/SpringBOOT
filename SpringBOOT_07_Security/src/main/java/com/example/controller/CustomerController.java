package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String getCustomer() {
		return "Able to access get customer Request";
	}
}

