package com.intellimed.springannotation;

public class SwimCoach implements Coach {
	
	private WeatherService weatherService;
	

	
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

	
}
