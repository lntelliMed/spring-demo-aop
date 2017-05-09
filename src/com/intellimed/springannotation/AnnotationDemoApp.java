package com.intellimed.springannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Coach coach = context.getBean("theSillyCoach", Coach.class);
		Coach coach = context.getBean("tennisCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyWeather());

		Coach coach2 = context.getBean("trackCoach", Coach.class);
		System.out.println(coach2.getDailyWorkout());
		System.out.println(coach2.getDailyWeather());
		
		context.close();
	}
}
