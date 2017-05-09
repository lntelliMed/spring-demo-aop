package com.intellimed.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	@Autowired
	@Qualifier("niceWeatherService")
	private WeatherService weatherService;
	
	public TrackCoach(){
		System.out.println(">> TrackCoach: Inside TrackCoach()");
	}
	
	/*
	@Autowired
	// Constructor injection
	public TrackCoach(WeatherService weatherService){
		this.weatherService = weatherService;
	}
	*/
	
	public WeatherService getWeatherService() {
		return weatherService;
	}

	/*
	@Autowired
	// Setter injection
	public void setWeatherService(WeatherService weatherService) {
		System.out.println(">> TrackCoach: Inside setWeatherService(WeatherService weatherService)");
		this.weatherService = weatherService;
	}
	*/
	
	/*
	@Autowired
	// Any method with any name can be injected!
	public void doSomeInterestingStuff(WeatherService weatherService) {
		System.out.println(">> TrackCoach: Inside doSomeInterestingStuff(WeatherService weatherService)");
		this.weatherService = weatherService;
	}
	 */
	
	@Override
	public String getDailyWorkout() {
		return "Run 5 miles";
	}

	@Override
	public String getDailyWeather() {
		return weatherService.getWeather();
	}

}
