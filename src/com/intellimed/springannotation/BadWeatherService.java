package com.intellimed.springannotation;

public class BadWeatherService implements WeatherService {

	@Override
	public String getWeather() {
		return "Today is rainy!";
	}

}
