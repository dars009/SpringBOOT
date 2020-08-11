package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Employee;
import com.example.service.EmployeeService;

 
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
 
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}
		
	@PostMapping("/createEmployee")
	public void createEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}
	
	@GetMapping(value = "/getEmployee/{id}")
	public Employee getEmployeeById(@PathVariable("id") Integer id) {
		return employeeService.findEmployee(id);
	} 

	@DeleteMapping(value = "/deleteEmployee/{id}")
	public void deleteEmployeeById(@PathVariable("id") Integer id) {
		System.out.println("Id from user" + id);
		employeeService.deleteEmployee(id);
	} 
	
	@PutMapping(value = "/updateEmployee")
	public void updateEmployeeById(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
	}
	
}