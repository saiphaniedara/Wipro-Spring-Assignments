package com.wipro.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Student;
import com.wipro.dao.StudentDAO;

@Controller
public class StudentController {
	@Autowired
	StudentDAO dao;
	@RequestMapping("/")
	public ModelAndView displayStudents() {
		List<Student> students = dao.getAllStudents();
		ModelAndView mv = new ModelAndView();
		if(students.size()==0) {
			mv.addObject("msg", "No Student Records Found...");
			mv.setViewName("NoStudents");
		}
		else {
			mv.addObject("ss", students);
			mv.setViewName("DisplayStudents");
		}
		return mv;
	}
}
