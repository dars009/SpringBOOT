package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExceptionUtil.EmployeeNotFoundException;
import com.example.beans.Employee;
import com.example.dao.EmployeeDAO;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	// to get all employee from batabase
	public List<Employee> getAllEmployee() {
		return (List<Employee>) employeeDAO.findAll();
	}

	public void saveEmployee(Employee employee) {
		employeeDAO.save(employee);
	}

	public Employee findEmployee(Integer id) {
		Optional<Employee> emp = employeeDAO.findById(id);
		Employee emp1 = null;
		if (emp.isPresent()) {
			emp1 = emp.get();
		} else {
			throw new EmployeeNotFoundException("Employee not found in database ID : " + id);
		}
		return emp.get();
	}

	public void updateEmployee(Employee employee) {
		employeeDAO.save(employee);
	}

	public void deleteEmployee(Integer id) {
		employeeDAO.deleteById(id);
	}
}
