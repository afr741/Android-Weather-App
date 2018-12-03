package com.ImprovedClima.androidweatherapp.json;

import java.util.List;

public class FiveWeathers {

    private String dt_txt;

    private com.ImprovedClima.androidweatherapp.json.Main main;

    private List<com.ImprovedClima.androidweatherapp.json.WeatherResults> conditions;

    public FiveWeathers(String dt_txt, com.ImprovedClima.androidweatherapp.json.Main main, List<com.ImprovedClima.androidweatherapp.json.WeatherResults> conditions) {
        this.dt_txt = dt_txt;
        this.main = main;
        this.conditions = conditions;
    }

    public String getDt_txt(){
        return dt_txt;
    }

    public com.ImprovedClima.androidweatherapp.json.Main getMain() {
        return main;
    }

    public List<com.ImprovedClima.androidweatherapp.json.WeatherResults> getConditions() {
        return conditions;
    }
}
