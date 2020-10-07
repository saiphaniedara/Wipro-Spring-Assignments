package com.wipro.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.wipro.bean.Student;
import com.wipro.bean.Test;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource rs = new FileSystemResource("src/main/resources/beans.xml");
		BeanFactory bF = new XmlBeanFactory(rs);
		Student s1 = (Student) bF.getBean("student1");
		System.out.println(s1);
		Student s2 = (Student) bF.getBean("student2");
		System.out.println(s2);
	}

}
