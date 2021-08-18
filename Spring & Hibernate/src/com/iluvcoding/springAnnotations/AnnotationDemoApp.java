package com.iluvcoding.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("springAnnotation-applicationContext.xml");
	
	Coach theCoach=context.getBean("thatSillyCoach", Coach.class);
	
	System.out.println(theCoach.getDailyWorkout());
	context.close();
	
	
}
