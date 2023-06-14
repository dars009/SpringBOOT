package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.beans.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

}
