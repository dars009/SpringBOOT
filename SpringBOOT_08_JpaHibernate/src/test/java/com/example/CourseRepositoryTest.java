package com.example;


import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.entity.Course;
import com.example.repository.CourseRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class CourseRepositoryTest {

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repository;
	
	@Test
	public void findById_basic() {
		Course course = repository.findById(1002L);
		assertEquals("Java Selenium", course.getName());
	}
	
	@Test
	@DirtiesContext 
	// reset data so actule data will not change bcoz of test case
	public void deleteByID_basic() {
		repository.deleteById(1000L);
		assertNull(repository.findById(1000L));
	}

	@Test
	@DirtiesContext 
	// reset data so actule data will not change bcoz of test case
	public void save_basic() {
		//get a course
		Course course = repository.findById(1002L);
		assertEquals("Java Selenium", course.getName());
		
		//update detail
		course.setName("Python with django");
		repository.save(course);

		//check the value
		Course course1 = repository.findById(1002L);
		assertEquals("Python with django", course1.getName());
		
	}
}
