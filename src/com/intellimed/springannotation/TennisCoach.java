package com.intellimed.springannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Component("theSillyCoach")
@Component
//@Scope("prototype")// Prototype will not call @PreDestory
@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomWeatherService")
	private WeatherService weatherService;

	public TennisCoach(){
		System.out.println(">> TennisCoach: Inside TennisCoach()");
	}
	
	/*
	@Autowired
	// Constructor injection
	public TennisCoach(WeatherService weatherService){
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
		System.out.println(">> TennisCoach: Inside setWeatherService(WeatherService weatherService)");
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
		return "Practice with the racket for 15 minutes";
	}

	@Override
	public String getDailyWeather() {
		return weatherService.getWeather();
	}

	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println(">> TennisCoach: Inside doMyStartupStuff()");
	}
	
	@PreDestroy
	public void doMyCleanupStuff(){
		System.out.println(">> TennisCoach: Inside doMyCleanupStuff()");
	}
}
