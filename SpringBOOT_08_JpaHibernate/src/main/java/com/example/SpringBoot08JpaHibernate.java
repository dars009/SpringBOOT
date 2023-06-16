package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot08JpaHibernate {

	private Logger logger = LoggerFactory.getLogger(SpringBoot08JpaHibernate.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot08JpaHibernate.class, args);
	}

}
