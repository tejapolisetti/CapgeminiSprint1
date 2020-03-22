package com.capgemini.OnlineMovieBooking.services;

import com.capgemini.OnlineMovieBooking.Dto.Movie;
import com.capgemini.OnlineMovieBooking.Dto.Screen;

public interface ItheatreService {
	public void addMovie(Integer theatre_id,Movie movie);
	public void addScreen(Integer theatreid,Screen screen);
	public Movie[] getListOfMovies(Integer id);

}
