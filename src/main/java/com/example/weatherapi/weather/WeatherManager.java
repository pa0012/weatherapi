package com.example.weatherapi.weather;

public interface WeatherManager {
	public double getWeather(String date);
	
	public double getWindSpeed(String date);
	
	public double getPressure(String date);
}
