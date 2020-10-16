package com.wipro.bean;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class MoviesList {
	private ArrayList<String> movies;

	public ArrayList<String> getMovies() {
		return movies;
	}

	public void setMovies(ArrayList<String> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Top Movies List = " + movies;
	}
}
