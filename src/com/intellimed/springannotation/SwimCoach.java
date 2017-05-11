package com.intellimed.springannotation;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private WeatherService weatherService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(WeatherService weatherService) {
		this.weatherService = weatherService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters";
	}

	@Override
	public String getDailyWeather() {
		return weatherService.getWeather();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	
	
}
