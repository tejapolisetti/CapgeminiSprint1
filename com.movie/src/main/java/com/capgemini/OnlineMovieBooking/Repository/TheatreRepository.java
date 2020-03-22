package com.capgemini.OnlineMovieBooking.Repository;

import java.math.BigInteger;
import java.util.HashMap;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import com.capgemini.OnlineMovieBooking.Dto.Theatre;

public class TheatreRepository {
	public static HashMap<Integer,Theatre> theatreMap=new HashMap<Integer,Theatre>();
	static private Integer theatreId=2000;
	static
	{
		//Theatre theatre=new Theatre();
		theatreMap.put(2000,new Theatre(2000,"Geeta Multiplex","Bhimavaram","Teja","9873728987"));	
		theatreMap.put(2001,new Theatre(2001,"Narendra Complex","Tanuku","Gokul","9123456789"));
		theatreMap.put(2002,new Theatre(2002,"Sri Venkateswara","Hyderabad","Dheeraj","9603108977"));
		theatreMap.put(2003,new Theatre(2003,"VMax","Rajahmundry","Satpal","9878945612"));
	}
	public TheatreRepository() {
		// TODO Auto-generated constructor stub
	}
	public static Theatre getTheatre(Integer id)
	{
		return theatreMap.get(id);
	}

}
