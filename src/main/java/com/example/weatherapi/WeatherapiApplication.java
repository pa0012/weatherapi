package com.example.weatherapi;

import java.util.Scanner;

import com.example.weatherapi.weather.WeatherManager;
import com.example.weatherapi.weather.WeatherManagerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherapiApplication.class, args);
		
		WeatherManager wm = new WeatherManagerImpl(); 
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Enter input: ");
			int input = sc1.nextInt();
			
			if(input == 0) {
				System.out.println("Program exited..");
				break;
			}
						
			switch(input) {
				case 1:	
					System.out.println("Enter date: ");
					String date = sc2.nextLine();
					double result = wm.getWeather(date);
					WeatherapiApplication.printResponse(result, "temperature");
					break;
				case 2: 
					System.out.println("Enter date: ");
					date = sc2.nextLine();  
					result = wm.getWindSpeed(date);
					WeatherapiApplication.printResponse(result, "wind speed");
					break;
				case 3:
					System.out.println("Enter date: ");
					date = sc2.nextLine();
					result = wm.getPressure(date);
					WeatherapiApplication.printResponse(result, "pressure");
					break;
				default:
					System.out.println("Please enter a valid input");
					break;
			}
	   }
		
		sc1.close(); sc2.close();
		
	}
	
	public static void printResponse(double result, String type) {
		if(result == Double.MIN_VALUE) {
			System.out.println("No data for the given input");
		}
		
		else {
			System.out.println("The " + type + " for the given date and time is: "+result);
		}
	}
}
