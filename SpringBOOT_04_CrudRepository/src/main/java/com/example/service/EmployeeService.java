package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.beans.Employee;
import com.example.dao.EmployeeDAO;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	// to get all employee from batabase
	public List<Employee> getAllEmployee(){
		return (List<Employee>) employeeDAO.findAll();
	}
	
	public void saveEmployee(Employee employee) {
		employeeDAO.save(employee);
	}
	
	public Optional<Employee> findEmployee(Integer id) {
		return employeeDAO.findById(id);
	}
	
	public void updateEmployee(Employee employee) {
		employeeDAO.save(employee);
	}
	
	public void deleteEmployee(Integer id) {
		employeeDAO.deleteById(id);
	}
}
