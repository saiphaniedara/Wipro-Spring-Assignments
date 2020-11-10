package com.wipro.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wipro.bean.Student;

@Repository
@Transactional
public class StudentDAO {
	@Autowired
	SessionFactory sf;
	@Autowired
	HibernateTemplate ht;
	public String insertStudentData(Student stud) {
		String msg;
		if(stud!=null) {
			try {
				ht.save(stud);
				msg="Student Details Inserted Successfully...";
			}
			catch (Exception e) {
				// TODO: handle exception
				msg = "Student Details Not Inserted! Please Try Again...";
			}
		}
		else {
			msg = "Student Details Not Inserted! Please Try Again...";
		}
		return msg;
	}
}
