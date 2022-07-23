package com.example.weatherapi.weather;

import com.example.weatherapi.util.Util;
import com.example.weatherapi.dto.Root;

public class WeatherManagerImpl implements WeatherManager {
	
	private Util util;
	
	public WeatherManagerImpl() {
		util = new Util();
	}
	
	@Override
	public double getWeather(String date) {
		Root result = util.getResponse();
		
		for(int i = 0; i<result.list.size(); i++) {
			if(result.list.get(i).dt_txt.equals(date)) {
				return result.list.get(i).main.temp;
			}
		}
			
		return Double.MIN_VALUE;
	}

	@Override
	public double getWindSpeed(String date) {
		Root result = util.getResponse();
		
		for(int i = 0; i<result.list.size(); i++) {
			if(result.list.get(i).dt_txt.equals(date)) {
				return result.list.get(i).wind.speed;
			}
		}
		
		return Double.MIN_VALUE;
	}

	@Override
	public double getPressure(String date) {
		Root result = util.getResponse();
		
		for(int i = 0; i<result.list.size(); i++) {
			if(result.list.get(i).dt_txt.equals(date)) {
				return result.list.get(i).main.pressure;
			}
		}
		
		return Double.MIN_VALUE;
	}
}
