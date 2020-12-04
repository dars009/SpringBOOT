package com.example.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.entity.Course;

@Repository
@Transactional
public class CourseRepository {

	private Logger logger = LoggerFactory.getLogger(CourseRepository.class);
	
	@Autowired
	EntityManager em;
	
	public Course findById(Long id) {
		return em.find(Course.class, id);
	}
	
	// for insert and update
	public Course save(Course course) {
		if(course.getId()==null) {
			// insert
			em.persist(course);
		}else {
			// merge
			em.merge(course);
		}
		return course;

	}

	public void deleteById(Long id) {
		Course course = findById(id);
		em.remove(course);
	}
	
	public void jpql_basics() {
		List list = em.createQuery("select c from Course c").getResultList();
		logger.info("List Using JPQL >>>> "+list);
	}
	
	public void jpql_typed() {
		TypedQuery<Course> courseType = em.createQuery("select c from Course c",Course.class);
		List<Course> list = courseType.getResultList();
		logger.info("List Using JPQL Typed Query >>>> "+list);
	}
	
	public void jpql_where() {
		TypedQuery<Course> courseType = em.createQuery("select c from Course c where name like '%java' ",Course.class);
		List<Course> list = courseType.getResultList();
		logger.info("List Using JPQL Typed Query >>>> "+list);
	}
	
	public void jpql_namedQuery() {
		TypedQuery<Course> resultList = em.createNamedQuery("getAllCourse_pojo",Course.class);
		List<Course> listofcourse= resultList.getResultList();
		logger.info("List using Named Query is >>>>>>>>>>>>>>" + listofcourse);
	}
	
	
	//statement = select * from login where email ="abc@gmail.com" and passwod ="abcdefgg" or 1=1;
	//select * from login where email = ? and password = ?
	
	
	public void jpql_where_java() {
		TypedQuery<Course> courseType = em.createNamedQuery("getAllcourse_pojo_like_java",Course.class);
		List<Course> list = courseType.getResultList();
		logger.info("List Using JPQL Typed Query >>>> "+list);
	}
	
	public void jpql_native() {
		Query query=em.createNativeQuery("select * from course",Course.class);
		List list = query.getResultList();
		logger.info("jpql_native >>>>"+list);
	}
	
	
	public void jpql_native_with_param() {
		Query query=em.createNativeQuery("select * from course where id = ?",Course.class);
		query.setParameter(1, 1000L);
		List list = query.getResultList();
		logger.info("jpql_native_with_param >>>>"+list);
	}
	
	public void jpql_native_with_named_parameter() {
		Query query=em.createNativeQuery("select * from course where id = :id",Course.class);
		query.setParameter("id", 1000L);
		List list = query.getResultList();
		logger.info("jpql_native_with_named_parameter >>>>"+list);
	}
	
	// native query will use for mass update
	public void jpql_native_with_mass_update() {
		Query query=em.createNativeQuery("select course set last_updated_date = sysdate()",Course.class);
		int result =query.executeUpdate();
		logger.info("jpql_native_with_mass_update >>>>"+result);
	}
}
