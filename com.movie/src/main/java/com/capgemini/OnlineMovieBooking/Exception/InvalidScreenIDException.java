package com.capgemini.OnlineMovieBooking.Exception;

public class InvalidScreenIDException extends Exception{
	public String getMesage()
	{
		return "Screen ID is not valid Please enter Again";
	}

}
