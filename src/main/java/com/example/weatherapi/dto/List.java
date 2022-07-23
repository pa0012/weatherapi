package com.example.weatherapi.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class List{
    public int dt;
    public Main main;
    public ArrayList<Weather> weather;
    public Clouds clouds;
    public Wind wind;
    public Sys sys;
    public String dt_txt;
}
