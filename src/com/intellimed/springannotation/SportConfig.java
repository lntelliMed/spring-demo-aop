package com.intellimed.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.intellimed.springannotation")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	@Bean
	public WeatherService badWeatherService(){
		return new BadWeatherService();
	}
	@Bean
	public Coach swimCoach(WeatherService weatherService){
		return new SwimCoach(badWeatherService());
	}

}
