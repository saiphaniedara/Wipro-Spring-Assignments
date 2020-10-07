package com.wipro.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.bean.ConstructorMessage;

public class Assignment2 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		ConstructorMessage cm = (ConstructorMessage) ac.getBean("msg");
		System.out.println(cm.getMessage());
	}
}
