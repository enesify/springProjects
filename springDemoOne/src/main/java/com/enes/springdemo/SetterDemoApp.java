package com.enes.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on the bean
		
		//close the contest

	}

}
