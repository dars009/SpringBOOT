package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoController {
	@GetMapping("/")
	public String WelcomePage() {
		return "Hello Spring BOOT Application";
	}
	
	@GetMapping("/getEmployee")
	public String getEmplpoyee() {
		return "Hello Employee";
	}
	
	@GetMapping("/getAllEmployee")
	public List<String> getAllEmployee(){
		List<String> list = new ArrayList<>();
		list.add("Darshit");
		list.add("Ayush");
		list.add("Ritesh");
		return list;
	}

}
