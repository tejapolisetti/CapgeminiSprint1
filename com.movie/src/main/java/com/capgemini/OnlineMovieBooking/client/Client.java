package com.capgemini.OnlineMovieBooking.client;

import java.util.Scanner;

import com.capgemini.OnlineMovieBooking.Dao.TheatreDao;
import com.capgemini.OnlineMovieBooking.Dto.Movie;
import com.capgemini.OnlineMovieBooking.Dto.Screen;
import com.capgemini.OnlineMovieBooking.Dto.Theatre;
import com.capgemini.OnlineMovieBooking.Exception.InvalidMovieNameException;
import com.capgemini.OnlineMovieBooking.Exception.InvalidScreenIDException;
import com.capgemini.OnlineMovieBooking.Repository.MovieRepository;
import com.capgemini.OnlineMovieBooking.Repository.ScreenRepository;
import com.capgemini.OnlineMovieBooking.Repository.TheatreRepository;
import com.capgemini.OnlineMovieBooking.services.TheatreService;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)  
	{
		Print display=new Print(); 
		Theatre theatre=new Theatre();
		Theatre theatre1=TheatreRepository.theatreMap.get(2000); 
		Theatre theatre2=TheatreRepository.theatreMap.get(2001);
		Theatre theatre3=TheatreRepository.theatreMap.get(2002);
		Theatre theatre4=TheatreRepository.theatreMap.get(2003);
		TheatreService service=new TheatreService();
		// Adding Movies to a particular Theatre
		service.addMovie(theatre1.getTheatreId(), MovieRepository.movieMap.get(3000));
		service.addMovie(theatre1.getTheatreId(), MovieRepository.movieMap.get(3001));
		service.addMovie(theatre2.getTheatreId(), MovieRepository.movieMap.get(3002));
		service.addMovie(theatre2.getTheatreId(), MovieRepository.movieMap.get(3003));
		service.addMovie(theatre3.getTheatreId(), MovieRepository.movieMap.get(3003));
		service.addMovie(theatre3.getTheatreId(), MovieRepository.movieMap.get(3004)); 
		service.addMovie(theatre4.getTheatreId(), MovieRepository.movieMap.get(3005));
		service.addMovie(theatre4.getTheatreId(), MovieRepository.movieMap.get(3004));
		//Adding screens to a particular Theatre
		service.addScreen(theatre1.getTheatreId(), ScreenRepository.screenMap.get(1001));
		service.addScreen(theatre1.getTheatreId(), ScreenRepository.screenMap.get(1002));
		service.addScreen(theatre2.getTheatreId(), ScreenRepository.screenMap.get(1003));
		Scanner input=new Scanner(System.in);
		while(true)
		{
		System.out.println("------------------------MENU------------------------------------");
		System.out.println("1.To know about Theatre Details"+"\n"
				+ "2.To see Available Movies in theatre"+"\n"
						+ "3.To Search Movie in Particuar Theatre"+"\n"
								+ "4.To Search Screen in Particular Theatre"+"\n"
										+ "5.Exit");
		System.out.println("Enter Choice");
		int choice=input.nextInt();
		switch(choice) {
		case 1:
		{
			System.out.println("Enter theatre ID to see details of Theatre:");
			int theatre_id=input.nextInt();
			display.showTheatreDetails(theatre_id);
			break;
		}
		case 2:
		{
			System.out.println("Enter theatre ID to see Available Movies in Theatre:");
			int theatre_id=input.nextInt();
			display.AvailableMovies(theatre_id);
			break;
		}
		case 3:
		{
			
			System.out.println("1.To search in Geeta Multiplex:"+"\n"
					+ "2.To search in Narendra Complex:"+"\n"
							+ "3.To search in Sri Venkateswara"+"\n"
									+ "4.To search in VMax"+"\n"
											+ "5.Exit");
			int ch1=input.nextInt();
			switch(ch1)
			{
			case 1:
			{
			System.out.println(theatre1.getTheatreName());
			System.out.println("Enter Movie names to search in theatre :");
			String s=input.next();
			display.printMovieDetails(theatre1.searchMovie(s));
			break;
			}
			case 2:
			{
				System.out.println(theatre2.getTheatreName());
				System.out.println("Enter Movie names to search in theatre :");
				String s=input.next();
				display.printMovieDetails(theatre2.searchMovie(s));
				
				break;
			}
			case 3:
			{
				System.out.println(theatre3.getTheatreName());
				System.out.println("Enter Movie names to search in theatre :");
				String s=input.next();
				display.printMovieDetails(theatre3.searchMovie(s));
				break;
			}
			case 4:
			{
				System.out.println(theatre4.getTheatreName());
				System.out.println("Enter Movie names to search in theatre :");
				String s=input.next();
				display.printMovieDetails(theatre4.searchMovie(s));
				break;
			}
			case 5:
			{
				System.exit(0);
			}
			}
			
			break  ;
			
		}
		case 4:
		{
			System.out.println("Enter Screen ID to see Available Screens in Theatre:");
			int theatre_id=input.nextInt();
			display.printScreenDetails(theatre1.searchScreen(theatre_id),theatre1);
			break;
		}
		case 5:
		{
			System.out.println("Have a Nice Day");
			System.exit(0);
		}
		default:
		{
			System.out.println("Invalid option");
		}
							
		 }
		}
		
		
	}
}
