package com.capgemini.OnlineMovieBooking.client;

import com.capgemini.OnlineMovieBooking.Dto.Movie;
import com.capgemini.OnlineMovieBooking.Dto.Screen;
import com.capgemini.OnlineMovieBooking.Dto.Theatre;
import com.capgemini.OnlineMovieBooking.Exception.InvalidMovieNameException;
import com.capgemini.OnlineMovieBooking.Exception.InvalidScreenIDException;
import com.capgemini.OnlineMovieBooking.Repository.TheatreRepository;

public class Print {
	public void printMovieDetails(Movie movie) 
	{
		try {
		if(movie==null)
			{
			//System.out.println("No such movie exist");
			throw new InvalidMovieNameException();
			}
		}
		catch(InvalidMovieNameException object)
		{
			System.out.println(object.getMessage());
			return;
		}
		System.out.println("Name of the Movie : "+movie.getMovieName());
		System.out.println("Genre : "+movie.getMovieGenre());
		System.out.println("Run Time : "+movie.getMovieLength()+" minutes");
		System.out.println("Director Name : "+movie.getMovieDirector());
		System.out.print("Available in :");
		System.out.println();
		for(int i=0;i<movie.getLanguages().length;i++)
		{
			System.out.println(movie.getLanguages()[i]);
		}
		System.out.println("Release Date : "+movie.getMovieReleaseDate() );
	}
	public void printScreenDetails(Screen s,Theatre t) 
	{
		try {
		if(s==null)
		{
		//System.out.println("No such screen exist");
		//return;
			throw new InvalidScreenIDException();
		}
		}
		catch(InvalidScreenIDException object1)
		{
			System.out.println(object1.getMesage());
			return;
		}
		System.out.println("screen Id:"+s.getScreenId());
		System.out.println("Theatre Id:"+s.getTheatreId());
		System.out.println("Theatre Name:"+t.getTheatreName());
		System.out.println("screen name:"+s.getScreenName());
		System.out.println("Screen size:"+s.getRows()*s.getColumns());
		System.out.println("Shows:"+s.getShowList());
	}
	public void AvailableMovies(Integer id)
	{
		for (int i = 0; i < TheatreRepository.theatreMap.get(id).getListOfMovies().length; i++) {
			System.out.println(TheatreRepository.theatreMap.get(id).getListOfMovies()[i].getMovieName());;
		}
	}
	public void showTheatreDetails(Integer id)
	{
		Theatre theatre=TheatreRepository.theatreMap.get(id);
		if(theatre==null)
		{
			System.out.println("No theatre exists with given Id");
			return;
		}
		System.out.println("Theatre Id : "+theatre.getTheatreId());
		System.out.println("Theatre Name : "+theatre.getTheatreName());
		System.out.println("Theatre City : "+ theatre.getTheatreCity());
		System.out.println("Manager Name:"+theatre.getManagerName());
		System.out.println("Manager Contact :"+theatre.getManagerContact());
	}


}
