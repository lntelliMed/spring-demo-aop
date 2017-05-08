package com.intellimed.springannotation;

import org.springframework.stereotype.Component;

//@Component("theSillyCoach")
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice with the racket for 15 minutes";
	}

}
