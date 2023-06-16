package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional()
public class CourseRepository {

	private Logger logger = LoggerFactory.getLogger(CourseRepository.class);

	@Autowired
	EntityManager em;
	
	
	public Course findById(Long id) {
		return em.find(Course.class, id);
	}

	// for insert and update
	public Course save(Course course) {
		if (course.getId() == null) {
			// insert
			em.persist(course);
		} else {
			// merge
			em.merge(course);
		}
		return course;

	}

	public void deleteById(Long id) {
		Course course = findById(id);
		em.remove(course);
	}

	public List<Course> jpql_basics() {
		List list = (ArrayList<Course>) em.createQuery("select c from Course c").getResultList();
		logger.info("List Using JPQL >>>> " + list);
		return list;
	}

	public List<Course> jpql_typed() {
		TypedQuery<Course> courseType = em.createQuery("select c from Course c", Course.class);
		List<Course> list = (ArrayList<Course>) courseType.getResultList();
		logger.info("List Using JPQL Typed Query >>>> " + list);
		return list;
	}

	public List<Course> jpql_where() {
		TypedQuery<Course> courseType = em.createQuery("select c from Course c where name like '%java' ", Course.class);
		List<Course> list = (ArrayList<Course>) courseType.getResultList();
		logger.info("List Using JPQL Typed Query >>>> " + list);
		return list;
	}

	public List<Course> jpql_namedQuery() {
		TypedQuery<Course> resultList = em.createNamedQuery("getAllCourse_pojo", Course.class);
		List<Course> listofcourse = (ArrayList<Course>) resultList.getResultList();
		logger.info("List using Named Query is >>>>>>>>>>>>>>" + listofcourse);
		return listofcourse;
	}

	// statement = select * from login where email ="abc@gmail.com" and passwod
	// ="abcdefgg" or 1=1;
	// select * from login where email = ? and password = ?

	public List<Course> jpql_where_java() {
		TypedQuery<Course> courseType = em.createNamedQuery("getAllcourse_pojo_like_java", Course.class);
		List<Course> list = (ArrayList<Course>) courseType.getResultList();
		logger.info("List Using JPQL Typed Query >>>> " + list);
		return list;
	}

	public List<Course> jpql_native() {
		Query query = em.createNativeQuery("select * from COURSE", Course.class);
		List list = (ArrayList<Course>) query.getResultList();
		logger.info("jpql_native >>>>" + list);
		return list;
	}

	public List<Course> jpql_native_with_param() {
		Query query = em.createNativeQuery("select * from course where id = ?", Course.class);
		query.setParameter(1, 1000L);
		List list = (ArrayList<Course>) query.getResultList();
		logger.info("jpql_native_with_param >>>>" + list);
		return list;
	}

	public List<Course> jpql_native_with_named_parameter() {
		Query query = em.createNativeQuery("select * from course where id = :id", Course.class);
		query.setParameter("id", 1000L);
		List list = (ArrayList<Course>) query.getResultList();
		logger.info("jpql_native_with_named_parameter >>>>" + list);
		return list;
	}

	// native query will use for mass update
	public Integer jpql_native_with_mass_update() {
		Query query = em.createNativeQuery("select course set last_updated_date = sysdate()", Course.class);
		int result = query.executeUpdate();
		logger.info("jpql_native_with_mass_update >>>>" + result);
		return result;
	}

	public void generateRecords() {
		Course c= new Course();
		c.setName("Java");
		Course c1= new Course();
		c1.setName("zig");
		Course c2= new Course();
		c2.setName("earlang");
		Course c3= new Course();
		c3.setName("ruby");
		Course c4= new Course();
		c4.setName("shell");
		Course c5= new Course();
		c5.setName("python");
		save(c);
		save(c1);
		save(c2);
		save(c3);
		save(c4);
		save(c5);
		
	}
}
