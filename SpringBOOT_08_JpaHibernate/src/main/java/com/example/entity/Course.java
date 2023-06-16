package com.example.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@NamedQueries(value = {
	@NamedQuery(name = "getAllCourse_pojo", query = "select c from Course c"),
	@NamedQuery(name = "getAllcourse_pojo_like_java", query = "select c from Course c where id="+1000)
})

//@NamedQuery(name = "getAllCourse_pojo", query = "select c from Course c")
@Table//(name="courseDetail") //"COURSE_TABLE"//can use for diffrent name of table in db
public class Course {

	@Id
	@GeneratedValue
	private Long id;

	// nullable will create table with not null
	@Column(nullable = false)
	private String name;
	
	// solution provide by hibernate
	@UpdateTimestamp
	private LocalDateTime lastUpdatedDate;
	
	@CreationTimestamp
	private LocalDateTime createdDate;

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}

}
