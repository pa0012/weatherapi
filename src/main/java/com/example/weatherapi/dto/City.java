package com.example.weatherapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class City{
    public int id;
    public String name;
    public Coord coord;
    public String country;
    public int population;
}
