package com.capgemini.OnlineMovieBooking.Repository;
import java.util.Arrays;
import java.util.HashMap;

import com.capgemini.OnlineMovieBooking.Dto.*;

public class ScreenRepository {

	
	
	public static HashMap<Integer,Screen> screenMap=new HashMap<Integer,Screen>();
	static
	{
		String arr[]= {"Eega","GOD OF WAR"};
		String arr1[]= {"World Famous Lover","Bahubali"};
		String arr2[]= {"Kumari 21F","Rakshasudu"};
		String arr3[]= {"War","Mission Mangal"};
		
		screenMap.put(1001, new Screen(1001,2000,"SCREEN 1",Arrays.asList(arr),5,6));
		screenMap.put(1002, new Screen(1002,2000,"SCREEN 2",Arrays.asList(arr1),15,7));
		screenMap.put(1003, new Screen(1003,2001,"SCREEN 1",Arrays.asList(arr2),5,5));
		screenMap.put(1004, new Screen(1004,2002,"SCREEN 1",Arrays.asList(arr3),8,8));
		screenMap.put(1005, new Screen(1005,2003,"SCREEN 1",Arrays.asList(arr),5,5));
		screenMap.put(1006, new Screen(1006,2003,"SCREEN 2",Arrays.asList(arr1),5,5));
		screenMap.put(1007, new Screen(1007,2003,"SCREEN 3",Arrays.asList(arr2),5,5));
	}
	public ScreenRepository() {
		// TODO Auto-generated constructor stub
	}
	
	public static HashMap<Integer, Screen> getScreenData() {
		return screenMap;
	}
	
	
	
}
