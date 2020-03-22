package com.capgemini.OnlineMovieBooking.services;

import com.capgemini.OnlineMovieBooking.Dao.TheatreDao;
import com.capgemini.OnlineMovieBooking.Dto.Movie;
import com.capgemini.OnlineMovieBooking.Dto.Screen;
import com.capgemini.OnlineMovieBooking.Dto.Theatre;
import com.capgemini.OnlineMovieBooking.Repository.ScreenRepository;
import com.capgemini.OnlineMovieBooking.Repository.TheatreRepository;

public class TheatreService implements ItheatreService {
	TheatreDao dao=new TheatreDao();

	public TheatreService() {
		// TODO Auto-generated constructor stub
	}
	public void addMovie(Integer theatre_id,Movie movie)
	{
		dao.addMovie(theatre_id, movie);
	}
	public void addScreen(Integer theatreid,Screen screen)
	{
		dao.addScreen(theatreid, screen);
	}
	public Movie[] getListOfMovies(Integer id)
	{
		return dao.getListOfMovies(id);
	}
	}
