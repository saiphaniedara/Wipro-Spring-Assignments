package com.wipro.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.wipro.bean.Student;

@Component
public class StudentDAO {
	@Autowired
	SessionFactory sf;
	@Autowired
	HibernateTemplate ht;
	public List<Student> getAllStudents() {
		Session s = sf.openSession();
		Query<Student> q = s.createQuery("from Student",Student.class);
		List<Student> students = q.getResultList();
		s.close();
		return students;
	}
}
