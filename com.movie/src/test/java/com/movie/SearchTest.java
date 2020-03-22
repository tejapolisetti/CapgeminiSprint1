package com.movie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.OnlineMovieBooking.Dao.TheatreDao;
import com.capgemini.OnlineMovieBooking.Dto.Theatre;
import com.capgemini.OnlineMovieBooking.Exception.InvalidMovieNameException;
import com.capgemini.OnlineMovieBooking.Repository.MovieRepository;
import com.capgemini.OnlineMovieBooking.Repository.ScreenRepository;
import com.capgemini.OnlineMovieBooking.Repository.TheatreRepository;
import com.capgemini.OnlineMovieBooking.services.TheatreService;

class SearchTest {

	@Test
	void test() {
		
		Theatre theatre1=TheatreRepository.theatreMap.get(2000);
		TheatreService service=new TheatreService();
		service.addMovie(theatre1.getTheatreId(), MovieRepository.movieMap.get(3000));
		assertEquals("Drama",theatre1.searchMovie("eega").getMovieGenre() );
	}
	@Test
void test1() {
		
		Theatre theatre2=TheatreRepository.theatreMap.get(2001);
		TheatreService service=new TheatreService();
		service.addMovie(theatre2.getTheatreId(), MovieRepository.movieMap.get(3001));
		assertEquals("World Famous Lover",theatre2.searchMovie("World Famous Lover").getMovieName());
	}
	@Test
void test2() {
		
		Theatre theatre1=TheatreRepository.theatreMap.get(2000);
		TheatreService service=new TheatreService();
		service.addScreen(theatre1.getTheatreId(), ScreenRepository.screenMap.get(1001));
		assertEquals("SCREEN 1",theatre1.searchScreen(1001).getScreenName());
	}
	@Test
void test3() {
		
		Theatre theatre2=TheatreRepository.theatreMap.get(2001);
		TheatreService service=new TheatreService();
		service.addScreen(theatre2.getTheatreId(), ScreenRepository.screenMap.get(1002));
		assertEquals("SCREEN 2",theatre2.searchScreen(1002).getScreenName());
	}
	@Test
	void test4()
	{
		Theatre theatre=TheatreRepository.theatreMap.get(2003);
		TheatreService service=new TheatreService();
		service.addScreen(theatre.getTheatreId(), ScreenRepository.screenMap.get(1007));
		assertEquals("SCREEN 3", theatre.searchScreen(1007).getScreenName());
	}

}
