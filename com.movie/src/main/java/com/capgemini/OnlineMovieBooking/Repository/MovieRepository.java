package com.capgemini.OnlineMovieBooking.Repository;

import java.util.Date;
import java.util.HashMap;

import com.capgemini.OnlineMovieBooking.Dto.*;

public class MovieRepository {

	public static HashMap<Integer,Movie> movieMap=new HashMap<Integer,Movie>();
	static
	{
		movieMap.put(3000,new Movie(3000, "eega","Drama","Rajamouli", 141, new Date(2020,2,25)));
		movieMap.put(3001,new Movie(3001, "World Famous Lover","Romantic","Sandeep Reddy Vanga", 181, new Date(2020,3,30)));
		movieMap.put(3002,new Movie(3002, "pokiri","Crime/Suspene","Puri Jagannath", 152, new Date(2020,4,5)));
		movieMap.put(3003,new Movie(3003, "athadu","Comedy/Crime","Trivikram", 155, new Date(2020,4,12)));
		movieMap.put(3004,new Movie(3004, "sahoo","Action","Sujeeth", 152, new Date(2020,4,5)));
		movieMap.put(3005,new Movie(3005, "lovers","Love/comedy","Maruthi", 160, new Date(2020,7,10)));
	}
	
	public MovieRepository() {
		// TODO Auto-generated constructor stub
	}

	public Movie getMovieDetails(Integer movieid)
	{
		return movieMap.get(movieid);
		
	}
}
