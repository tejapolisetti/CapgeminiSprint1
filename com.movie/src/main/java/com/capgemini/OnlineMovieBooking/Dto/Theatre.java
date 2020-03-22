package com.capgemini.OnlineMovieBooking.Dto;

import com.capgemini.OnlineMovieBooking.Repository.TheatreRepository;

public class Theatre {

	private Integer theatreId;
	private String theatreName;
	private String theatreCity;
	private Movie[] listOfMovies;
	private Screen[] listOfScreens;
	private String managerName;
	private String managerContact;
	
	public Theatre()
	{
		
		Screen screen=new Screen();
		
		
	}
	
	public Theatre(Integer theatreId, String theatreName, String theatreCity,
			String managerName, String managerContact) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}


	//This method will return movie name of Movie type
	public Movie searchMovie(String movieName)
	{
		if(this.getListOfMovies()==null) return null;
		for (int i = 0; i < listOfMovies.length; i++) {
			if(listOfMovies[i].getMovieName().equals(movieName))
			{
				return listOfMovies[i];
			}
		}
		return null;
	}
	//This method will return screenID of Screen type
	public Screen searchScreen(Integer screenid)
	{
		for (int i = 0; i < listOfScreens.length; i++) {
			if(listOfScreens[i].getScreenId().equals(screenid))
			{
				return listOfScreens[i];
			}
		}
		return null;
	}

	public Integer getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String getTheatreCity() {
		return theatreCity;
	}

	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}

	public Movie[] getListOfMovies() {
		return listOfMovies;
	}

	public void setListOfMovies(Movie[] listOfMovies) {
		this.listOfMovies = listOfMovies;
	}

	public Screen[] getListOfScreens() {
		return listOfScreens;
	}

	public void setListOfScreens(Screen[] listOfScreens) {
		this.listOfScreens = listOfScreens;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerContact() {
		return managerContact;
	}

	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	
	
	
	
	
}
