package com.example.model;

public class EmployeeResponse {

	private String name;
	private String city;
	private String phone;
	
	public EmployeeResponse() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeResponse(String name, String city, String phone) {
		super();
		this.name = name;
		this.city = city;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
