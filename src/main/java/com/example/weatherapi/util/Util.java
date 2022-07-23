package com.example.weatherapi.util;

import org.springframework.web.client.RestTemplate;
import com.example.weatherapi.dto.Root;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Util {
	
	private RestTemplate restTemplate; 
	private ObjectMapper objectMapper;
	
	public Util() {
		restTemplate = new RestTemplate();
		objectMapper = new ObjectMapper();
	}

	public Root getResponse() {
		String response;
		Root result = null;
		try {
			response = restTemplate.getForObject(getUri(), String.class);
			result = objectMapper.readValue(response, Root.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	 
   public String getUri() {
		return "https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22";
   }
}
