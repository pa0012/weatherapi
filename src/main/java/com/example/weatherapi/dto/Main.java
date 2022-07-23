package com.example.weatherapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
	public double temp;
    public double temp_min;
    public double temp_max;
    public double pressure;
    public double sea_level;
    public double grnd_level;
    public int humidity;
    public double temp_kf;
}
