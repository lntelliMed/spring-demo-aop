package com.intellimed.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach = context.getBean("tennisCoach", TennisCoach.class);
		
		coach.getDailyWorkout();
		
		context.close();
		
		
	}

}
