package com.capgemini.OnlineMovieBooking.Dao;

import com.capgemini.OnlineMovieBooking.Dto.Movie;
import com.capgemini.OnlineMovieBooking.Dto.Screen;

public interface ItheatreDao {
	public Movie[] getListOfMovies(Integer id);
	public void addMovie(Integer theatreid,Movie movie);
	public void addScreen(Integer theatreid,Screen screen);

}
