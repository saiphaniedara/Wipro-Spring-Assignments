package com.wipro.service;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.TopMoviesList;

@Controller
public class DisplayTopMoviesController {
	@RequestMapping("/views/DisplayTopMovies")
	public ModelAndView getTopMovies() {
		ModelAndView mv = new ModelAndView();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Stranger Things");
		al.add("Riverdale");
		al.add("The Vampire Diaries");
		al.add("13 Reasons Why");
		al.add("The Originals");
		al.add("Fast and Furious");
		al.add("Mission Impossible");
		al.add("The Legacies");
		al.add("Breaking Bad");
		al.add("Chilling adventures of Sabrina");
		TopMoviesList tml = new TopMoviesList();
		tml.setMoviesList(al);
		mv.addObject("movies", tml);
		mv.setViewName("DisplayMovieList");
		return mv;
	}
}
