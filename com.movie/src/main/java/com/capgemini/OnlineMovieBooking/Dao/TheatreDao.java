package com.capgemini.OnlineMovieBooking.Dao;

import com.capgemini.OnlineMovieBooking.Dto.Movie;
import com.capgemini.OnlineMovieBooking.Dto.Screen;
import com.capgemini.OnlineMovieBooking.Dto.Theatre;
import com.capgemini.OnlineMovieBooking.Repository.MovieRepository;
import com.capgemini.OnlineMovieBooking.Repository.TheatreRepository;

public class TheatreDao implements ItheatreDao{
	
	public Movie[] getListOfMovies(Integer id)
	{
		return TheatreRepository.theatreMap.get(id).getListOfMovies();
	}
	
	public void addMovie(Integer theatreid,Movie movie)
	{
		
		Theatre theatre=TheatreRepository.theatreMap.get(theatreid);//creating object of theatre based on theatreid to add movie into theatre
		Movie[] movielist=theatre.getListOfMovies();//list of movies of movie type
		if(movielist==null)
		{
			Movie[] tempListOfMovies= new Movie[1];
			tempListOfMovies[0]=movie;
			theatre.setListOfMovies(tempListOfMovies);
			TheatreRepository.theatreMap.replace(theatreid,theatre);//Updating theatre with movie
			return;
		}
		Movie[] temp= new Movie[movielist.length+1]; 
		for (int i = 0; i < movielist.length; i++) {
			temp[i]=movielist[i];
		}
		temp[movielist.length]=movie;
		theatre.setListOfMovies(temp);
		TheatreRepository.theatreMap.replace(theatreid,theatre );
		
	}
	public void addScreen(Integer theatreid,Screen screen)
	{
		Theatre theatre=TheatreRepository.theatreMap.get(theatreid);
		Screen[] screenlist=theatre.getListOfScreens();
		
		if(screenlist==null)
		{
			Screen[] tempScreenList= new Screen[1];
			tempScreenList[0]=screen;
			theatre.setListOfScreens(tempScreenList);
			TheatreRepository.theatreMap.replace(theatreid,theatre);
			return;
		}
		Screen[] tempScreenList= new Screen[screenlist.length+1];
		for (int i = 0; i < screenlist.length; i++) {
			tempScreenList[i]=screenlist[i];
		}
		tempScreenList[screenlist.length]=screen;
		theatre.setListOfScreens(tempScreenList);
		TheatreRepository.theatreMap.replace(theatreid, theatre);
		}
	
	

}
