package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Course;
import com.example.repository.CourseRepository;

@RestController
public class CourseController {

	@Autowired
	CourseRepository courseRepository;

	@PostMapping(path = "/generateRecords")
	public void generateRecords() {
		courseRepository.generateRecords();
	}

	@GetMapping(path = "/findCoursebyId/{id}")
	public Course findById(@RequestParam("id") Long id) {
		return courseRepository.findById(id);
	}

	@PostMapping(path = "/saveCourse")
	public Course save(@RequestBody Course course) {
		return courseRepository.save(course);
	}

	@DeleteMapping(path = "/deleteById/{id}")
	public void deleteById(@RequestParam("id") Long id) {
		courseRepository.deleteById(id);
	}

	@GetMapping(path = "/jpql_basics")
	public List<Course> jpql_basics() {
		return courseRepository.jpql_basics();
	}

	@GetMapping(path = "/jpql_typed")
	public List<Course> jpql_typed() {
		return courseRepository.jpql_typed();
	}

	@GetMapping(path = "/jpql_where")
	public List<Course> jpql_where() {
		return courseRepository.jpql_where();
	}

	@GetMapping(path = "/jpql_namedQuery")
	public List<Course> jpql_namedQuery() {
		return courseRepository.jpql_namedQuery();
	}

	@GetMapping(path = "/jpql_where_java")
	public List<Course> jpql_where_java() {
		return courseRepository.jpql_where_java();
	}

	@GetMapping(path = "/jpql_native")
	public List<Course> jpql_native() {
		return courseRepository.jpql_native();
	}

	@GetMapping(path = "/jpql_native_with_param")
	public List<Course> jpql_native_with_param() {
		return courseRepository.jpql_native_with_param();
	}

	@GetMapping(path = "/jpql_native_with_named_parameter")
	public List<Course> jpql_native_with_named_parameter() {
		return courseRepository.jpql_native_with_named_parameter();
	}

	@PutMapping(path = "/jpql_native_with_mass_update")
	public Integer jpql_native_with_mass_update() {
		return courseRepository.jpql_native_with_mass_update();
	}
}
