package com.ImprovedClima.androidweatherapp.json;


public class Weather {

    com.ImprovedClima.androidweatherapp.json.WeatherResults weatherResults;

    public Weather(com.ImprovedClima.androidweatherapp.json.WeatherResults weatherResults){
        this.weatherResults = weatherResults;
    }

    public com.ImprovedClima.androidweatherapp.json.WeatherResults getWeatherResults() {
        return weatherResults;
    }
}
