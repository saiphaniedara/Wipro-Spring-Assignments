package com.wipro.bean;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class TopMoviesList {
	private ArrayList<String> moviesList;

	public ArrayList<String> getMoviesList() {
		return moviesList;
	}

	public void setMoviesList(ArrayList<String> moviesList) {
		this.moviesList = moviesList;
	}

	@Override
	public String toString() {
		return "TopMoviesList [moviesList=" + moviesList + "]";
	}
}
