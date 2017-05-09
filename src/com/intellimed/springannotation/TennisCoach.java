package com.intellimed.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//@Component("theSillyCoach")
@Component
public class TennisCoach implements Coach {
	
	private WeatherService weatherService;

	@Autowired
	// Constructor injection
	public TennisCoach(WeatherService weatherService){
		this.weatherService = weatherService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice with the racket for 15 minutes";
	}

	@Override
	public String getDailyWeather() {
		return weatherService.getWeather();
	}

}
