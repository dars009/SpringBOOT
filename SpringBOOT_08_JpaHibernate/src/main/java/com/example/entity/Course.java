package com.example.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity

@NamedQueries({
	@NamedQuery(name = "getAllCourse_pojo", query = "select c from Course c"),
	@NamedQuery(name = "getAllcourse_pojo_like_java", query = "select c from Course c where id="+1000)
})

//@NamedQuery(name = "getAllCourse_pojo", query = "select c from Course c")
//@Table(name="courseDetail") //"COURSE_TABLE"//can use for diffrent name of table in db
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
