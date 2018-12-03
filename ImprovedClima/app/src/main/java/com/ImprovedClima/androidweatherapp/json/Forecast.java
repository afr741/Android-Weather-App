package com.ImprovedClima.androidweatherapp.json;


import java.util.List;

public class Forecast {

    private List<com.ImprovedClima.androidweatherapp.json.FiveWeathers> list;

    public Forecast(List<com.ImprovedClima.androidweatherapp.json.FiveWeathers> list) {
        this.list = list;
    }

    public List<com.ImprovedClima.androidweatherapp.json.FiveWeathers> getList() {
        return list;
    }
}
