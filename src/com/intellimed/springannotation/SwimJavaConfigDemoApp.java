package com.intellimed.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Coach coach = context.getBean("swimCoach", SwimCoach.class);
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyWeather());
		
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());

		context.close();

	}

}
