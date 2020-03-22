package com.capgemini.OnlineMovieBooking.Exception;

public class InvalidMovieNameException extends Exception{
	public String getMessage()
	{
		return "Movie Name is Not Valid Please enter again";
	}
	

}
