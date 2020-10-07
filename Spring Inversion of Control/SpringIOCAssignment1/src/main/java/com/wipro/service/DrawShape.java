package com.wipro.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.bean.Shape;

public class DrawShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Shape s1 = (Shape) ac.getBean("triangle");
		s1.draw();
		Shape s2 = (Shape) ac.getBean("rectangle");
		s2.draw();
		Shape s3 = (Shape) ac.getBean("parallelogram");
		s3.draw();
	}

}
