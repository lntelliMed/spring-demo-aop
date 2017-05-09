package com.intellimed.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	private WeatherService weatherService;
	
	@Autowired
	//Constructor injection
	public TrackCoach(WeatherService weatherService){
		this.weatherService = weatherService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 5 miles";
	}

	@Override
	public String getDailyWeather() {
		return weatherService.getWeather();
	}

}
