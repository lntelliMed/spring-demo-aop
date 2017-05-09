package com.intellimed.springannotation;

import java.util.Random;

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

}
