package com.wipro.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.bean.SetterMessage;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		SetterMessage sm = (SetterMessage) ac.getBean("msg");
		System.out.println(sm.getMessage());
	}

}
