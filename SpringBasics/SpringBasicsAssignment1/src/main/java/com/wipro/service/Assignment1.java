package com.wipro.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.wipro.bean.Movie;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource rs = new FileSystemResource("src/main/resources/beans.xml");
		BeanFactory bF = new XmlBeanFactory(rs);
		Movie m = (Movie)bF.getBean(Movie.class);
		System.out.println(m);
	}

}
