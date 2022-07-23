package com.example.weatherapi.weather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WeatherManagerImplTest {
	private WeatherManager weatherManager;
	
	@BeforeEach
	void setup() {
		weatherManager = new WeatherManagerImpl();
	}
	
	@Test
	@DisplayName("Get temperature for wrong input day")
	void testGetTemperature() {
		double expected = Double.MIN_VALUE;
		double actual = weatherManager.getPressure("2019-03-32");
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Get wind speed for wrong input month")
	void testGetWindSpeeed() {
		double expected = Double.MIN_VALUE;
		double actual = weatherManager.getWindSpeed("2019-14-29");
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Get pressure for wrong input year")
	void testGetPressure() {
		double expected = Double.MIN_VALUE;
		double actual = weatherManager.getPressure("20199-03-28");
		Assertions.assertEquals(expected, actual);
	}
}
