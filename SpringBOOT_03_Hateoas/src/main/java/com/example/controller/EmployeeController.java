package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/getEmployee")
	public String getEmplpoyee() {
		return "Hello Employee";
	}

	@GetMapping("/getAllEmployee")
	public List<String> getAllEmployee() {
		List<String> list = new ArrayList<>();
		list.add("Darshit");
		list.add("Ayush");
		list.add("Ritesh");
		return list;
	}

	/*
	 * IND -> MH -> Pune, Nagpur, Mumbai IND -> GJ -> Rajkot, Baroda, Ahmedabad IND
	 * -> RJ -> Jaipur IND -> Delhi -> null
	 */

	@GetMapping("/getIndCities")
	public Map<String, HashMap<String, List<String>>> getCities() {
		List<String> mhcity = new ArrayList<String>();
		mhcity.add("Pune");
		mhcity.add("Nagpur");
		mhcity.add("Mumbai");
		List<String> gjcity = new ArrayList<String>();
		gjcity.add("Rajkot");
		gjcity.add("Baroda");
		gjcity.add("Ahmedabad");
		List<String> rjcity = new ArrayList<String>();
		rjcity.add("Ajmer");
		rjcity.add("Jaipur");
		List<String> delhicity = new ArrayList<String>();
		delhicity.add(null);
		HashMap<String, List<String>> indstate = new HashMap<>();
		indstate.put("MH", mhcity);
		indstate.put("GJ", gjcity);
		indstate.put("RJ", rjcity);
		indstate.put("DEL", delhicity);
		Map<String, HashMap<String, List<String>>> country = new HashMap<String, HashMap<String, List<String>>>();
		country.put("IND", indstate);
		return country;
	}

	@GetMapping("/getEmp")
	public List<Employee> getEmp() {
		Employee employee = new Employee(1, "Ram", "Ayodhya", "000000000");
		Employee employee1 = new Employee(2, "Ayush", "Pune", "000333000");
		Employee employee2 = new Employee(3, "Darshit", "Ambegaon", "0444000000");
		Employee employee3 = new Employee(4, "Adi", "Sinhgad", "000044400");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(employee);
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		
		Link link = WebMvcLinkBuilder.linkTo(Employee.class).slash("employee").slash("getAllEmployee").withRel("For Get All Employee");
		Link link1 = WebMvcLinkBuilder.linkTo(Employee.class).slash("employee").slash("deleteEmployee").slash("id").withRel("For Delete Employee");
		
		employee.add(link);
		employee.add(link1);
		
		return list;
	}
}
