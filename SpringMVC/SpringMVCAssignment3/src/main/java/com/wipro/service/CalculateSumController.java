package com.wipro.service;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculateSumController {
	@RequestMapping("/views/CalSum")
	public ModelAndView getTotal(@RequestParam("sm") int sm, @RequestParam("mm") int mm, @RequestParam("em") int em) {
		ModelAndView mv = new ModelAndView();
		int totalMarks = sm+mm+em;
		mv.addObject("totalMarks", totalMarks);
		mv.setViewName("result");
		return mv;
	}
}
