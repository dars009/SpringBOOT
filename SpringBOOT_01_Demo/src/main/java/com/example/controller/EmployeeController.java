package com.example.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Employee;
import com.example.model.EmployeeResponse;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping(value = "/getEmployee")
	public String getEmplpoyee() {
		return "Hello Employee";
	}

	// get data form URL using @RequestParam we can make it optional by
	// add required = false property
	@GetMapping("/getEmployeeById")
	public List<String> getEmployeeById(@RequestParam("id") String id) {
		System.out.println(id);
		List<String> list = new ArrayList<>();
		list.add("Swapnil");
		list.add("Ganesh");
		list.add("Ritesh");
		return list;
	}

	// get data using @pathVariable "name" parameter is compulsory you have to pass
	@GetMapping("/getEmployeeByName/{name}")
	public List<String> getEmployeeByName(@PathVariable("name") String name) {
		System.out.println(name);
		List<String> list = new ArrayList<>();
		list.add("Swapnil");
		list.add("Ganesh");
		list.add("Ritesh");
		return list;
	}

	@PostMapping("/saveEmployee")
	public ResponseEntity<EmployeeResponse> saveEmployee(@RequestBody Employee emp) {
		EmployeeResponse er = new EmployeeResponse(emp.getName(), emp.getCity(), emp.getPhone());
		return new ResponseEntity<EmployeeResponse>(er, HttpStatus.CREATED);
	}

	@GetMapping("/getEmployeeHeader")
	public void getEmployeeToken(@RequestHeader("token") String token, @RequestHeader("version") String version) {

		System.out.println(token);
		System.out.println(version);
	}

	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() {
		return Arrays.asList(
				new Employee(1, "Suraj", "Pune", "9999999999"),
				new Employee(2, "Ram", "Pune", "9999999999"),
				new Employee(4, "Darshit", "Pune", "9999999999"),
				new Employee(19, "Avani", "Pune", "9999999999"));
	}

}
