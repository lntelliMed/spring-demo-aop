package com.intellimed.springannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		Coach alphaCoach = context.getBean("tennisCoach", TennisCoach.class);

		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("theCoach an alphaCoach are equal? " + result);
		System.out.println("theCoach.toString():  " + theCoach);
		System.out.println("alphaCoach.toString():  " + alphaCoach);

		context.close();
		
	}

}
