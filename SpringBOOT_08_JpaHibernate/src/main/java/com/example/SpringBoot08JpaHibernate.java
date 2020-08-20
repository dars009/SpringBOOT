package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Course;
import com.example.repository.CourseRepository;

@SpringBootApplication
public class SpringBoot08JpaHibernate implements CommandLineRunner {

	@Autowired
	private CourseRepository repository;

	private Logger logger = LoggerFactory.getLogger(SpringBoot08JpaHibernate.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot08JpaHibernate.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Course course = repository.findById(1000L);
		//logger.info("Course is ::: " + course);
		//repository.jpql_basics();
		
		repository.jpql_namedQuery();
		repository.jpql_where_java();
	}

}
