package com.example.weatherapp.myapplication.API.APIServices;

import com.example.weatherapp.myapplication.models.CityWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface WeatherServices {
    @GET("forecast/daily")
    Call<CityWeather> getWeatherCity (@Query("q") String city, @Query("APPID")String key, @Query("units") String units ,@Query("cnt") int days);

}
