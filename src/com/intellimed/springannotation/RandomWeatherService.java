package com.intellimed.springannotation;

import java.util.Arrays;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class RandomWeatherService implements WeatherService {

	private String[] weather = {
			"Today is hot!",
			"Today is warm!",
			"Today is mild!"
	};
	
	@Override
	public String getWeather() {
		Random random = new Random();
		return weather[random.nextInt(weather.length)];		
	}
	
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println(">> RandomWeatherService: Inside doMyStartupStuff(): " + this);
	}

	@Override
	public String toString() {
		return "RandomWeatherService [weather=" + Arrays.toString(weather) + "]";
	}

	
}
