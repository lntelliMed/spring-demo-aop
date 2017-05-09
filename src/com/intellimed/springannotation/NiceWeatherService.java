package com.intellimed.springannotation;

import org.springframework.stereotype.Component;

@Component
public class NiceWeatherService implements WeatherService {

	@Override
	public String getWeather() {
		return "Today is sunny!";
	}

}
