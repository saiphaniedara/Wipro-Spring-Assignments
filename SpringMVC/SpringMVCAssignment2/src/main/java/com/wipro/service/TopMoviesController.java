package com.wipro.service;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.MoviesList;

@Controller
public class TopMoviesController {
	@RequestMapping("/TopMovies" )
	public ModelAndView getMovies() {
		ModelAndView mv = new ModelAndView();
		MoviesList ml = new MoviesList();
		ArrayList<String> movies = new ArrayList<String>();
		movies.add("Stranger Things");
		movies.add("The Vampire Diaries");
		movies.add("The Originals");
		movies.add("Riverdale");
		movies.add("The Legacies");
		movies.add("Money Heist");
		movies.add("Fast and Furious");
		movies.add("Avengers");
		movies.add("Twilight");
		movies.add("Mission Impossible");
		ml.setMovies(movies);
		mv.addObject("moviesList",ml);
		mv.setViewName("DisplayTopMovies");
		return mv;
	}
}
