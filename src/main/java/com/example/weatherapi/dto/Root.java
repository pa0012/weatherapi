package com.example.weatherapi.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Root{
    public String cod;
    public double message;
    public int cnt;
    public ArrayList<List> list;
    public City city;
}