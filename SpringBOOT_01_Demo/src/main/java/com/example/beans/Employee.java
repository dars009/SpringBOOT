package com.example.beans;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
// shorting data manner
@JsonPropertyOrder({"city","name"})
public class Employee {
	
	@JsonIgnore
	private Integer id;
	// alternate name 
	@JsonProperty("fullname")
	private String name;
	@JsonAlias("usercity")
	private String city;
	private String phone;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String name, String city, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", phone=" + phone + "]";
	}
	
	
	
	
}
