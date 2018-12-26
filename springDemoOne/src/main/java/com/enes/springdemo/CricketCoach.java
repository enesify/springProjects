package com.enes.springdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CricketCoach implements Coach {
	
	private static final Logger LOGGER = LogManager.getLogger(CricketCoach.class);
	
	private FortuneService fortuneService;
	
	//add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	//no-arg constructor
	public CricketCoach() {
		//System.out.println("CricketCoach: inside no-arg constructor");
		LOGGER.info("CricketCoach: inside no-arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		//System.out.println("CricketCoach: inside setter method - setFortuneService");
		LOGGER.info("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	
	// getter & setter methods
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		//System.out.println("CricketCoach: inside setter method - setEmailAddress");
		LOGGER.info("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		LOGGER.info("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

}
