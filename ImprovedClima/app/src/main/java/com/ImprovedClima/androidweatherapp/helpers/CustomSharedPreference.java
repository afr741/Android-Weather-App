package com.ImprovedClima.androidweatherapp.helpers;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ImprovedClima.androidweatherapp.entity.ListJsonObject;

import java.lang.reflect.Type;
import java.util.List;

public class CustomSharedPreference {

    private SharedPreferences sharedPref;

    private Gson gson;

    public CustomSharedPreference(Context context) {
        sharedPref = context.getSharedPreferences(com.ImprovedClima.androidweatherapp.helpers.Helper.PREFS_TAG, Context.MODE_PRIVATE);
        gson = new Gson();
    }

    public void setDataFromSharedPreferences(String key, List<ListJsonObject> listObjects) {
        String json = gson.toJson(listObjects);
        sharedPref.edit().putString(key, json).apply();
    }

    public List<ListJsonObject> getAllDataObject(String key){
        String stringObjects = sharedPref.getString(key, "");
        Type type = new TypeToken<List<ListJsonObject>>(){}.getType();
        return gson.fromJson(stringObjects, type);
    }

    public void setDataSourceIfPresent(boolean isData){
        sharedPref.edit().putBoolean(com.ImprovedClima.androidweatherapp.helpers.Helper.IS_DATA_PRESENT, isData).apply();
    }

    public boolean getDataSourceIfPresent(){
        return sharedPref.getBoolean(com.ImprovedClima.androidweatherapp.helpers.Helper.IS_DATA_PRESENT, false);
    }

    public void setLocationInPreference(String cityName){
        sharedPref.edit().putString(com.ImprovedClima.androidweatherapp.helpers.Helper.LOCATION_PREFS, cityName).apply();
    }

    public String getLocationInPreference(){
        return sharedPref.getString(com.ImprovedClima.androidweatherapp.helpers.Helper.LOCATION_PREFS, "");
    }
}
