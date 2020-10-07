package com.wipro.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.bean.DefaultMessage;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext aC = new ClassPathXmlApplicationContext("beans.xml");
		DefaultMessage dM = (DefaultMessage)aC.getBean(DefaultMessage.class);
		System.out.println(dM.getMessage());
	}

}
