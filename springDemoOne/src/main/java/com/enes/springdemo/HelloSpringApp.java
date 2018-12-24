package com.enes.springdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	private static final Logger LOGGER = LogManager.getLogger(HelloSpringApp.class);

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("This is debug : " + " _enes");
		}

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("This is info : " + " _enes");
		}

		LOGGER.warn("This is warn : " + " _enes");
		LOGGER.error("This is error : " + " _enes");
		LOGGER.fatal("This is fatal : " + " _enes");

		try {
			divide();
		} catch (Exception ex) {
			LOGGER.error("Divide by zero !", ex);
		}

		// close the context
		context.close();
	}

	private static void divide() {

		int i = 10 / 0;

	}

}
