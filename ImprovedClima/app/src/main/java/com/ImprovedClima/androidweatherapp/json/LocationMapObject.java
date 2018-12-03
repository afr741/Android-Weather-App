package com.ImprovedClima.androidweatherapp.json;


import java.util.List;

public class LocationMapObject {

    private Coord coord;

    private List<com.ImprovedClima.androidweatherapp.json.WeatherResults> weather;

    private String base;

    private com.ImprovedClima.androidweatherapp.json.Main main;

    private String visibility;

    private com.ImprovedClima.androidweatherapp.json.Wind wind;

    private com.ImprovedClima.androidweatherapp.json.Rain rain;

    private com.ImprovedClima.androidweatherapp.json.Clouds clouds;

    private String dt;

    private com.ImprovedClima.androidweatherapp.json.Sys sys;

    private String id;

    private String name;

    private String cod;

    public LocationMapObject(Coord coord, List<com.ImprovedClima.androidweatherapp.json.WeatherResults> weather, String base, com.ImprovedClima.androidweatherapp.json.Main main, String visibility, com.ImprovedClima.androidweatherapp.json.Wind wind, com.ImprovedClima.androidweatherapp.json.Rain rain, com.ImprovedClima.androidweatherapp.json.Clouds clouds, String dt, com.ImprovedClima.androidweatherapp.json.Sys sys, String id, String name, String cod) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.rain = rain;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public Coord getCoord() {
        return coord;
    }

    public List<com.ImprovedClima.androidweatherapp.json.WeatherResults> getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public com.ImprovedClima.androidweatherapp.json.Main getMain() {
        return main;
    }

    public String getVisibility() {
        return visibility;
    }

    public com.ImprovedClima.androidweatherapp.json.Wind getWind() {
        return wind;
    }

    public com.ImprovedClima.androidweatherapp.json.Rain getRain() {
        return rain;
    }

    public com.ImprovedClima.androidweatherapp.json.Clouds getClouds() {
        return clouds;
    }

    public String getDt() {
        return dt;
    }

    public com.ImprovedClima.androidweatherapp.json.Sys getSys() {
        return sys;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCod() {
        return cod;
    }
}
