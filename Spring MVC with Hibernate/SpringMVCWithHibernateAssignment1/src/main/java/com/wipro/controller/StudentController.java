package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Student;
import com.wipro.dao.StudentDAO;

@Controller
public class StudentController {
	@Autowired
	StudentDAO dao;
	@RequestMapping("/")
	public ModelAndView setStudent() {
		Student st = new Student();
		ModelAndView mv = new ModelAndView();
		mv.addObject("stud", st);
		mv.setViewName("index");;
		return mv;
	}
	@RequestMapping(value = "/InsertStudent")
	public ModelAndView insertStudent(@ModelAttribute("stud") Student stud) {
		String msg = dao.insertStudentData(stud);
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg",msg);
		mv.setViewName("result");
		return mv;
	}
}
