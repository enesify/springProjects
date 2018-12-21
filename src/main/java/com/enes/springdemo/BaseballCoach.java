package com.enes.springdemo;

public class BaseballCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	
	public BaseballCoach(FortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
	}

	@Override
	public String getDailyFortune() {

		// use my fortuneservice to get a fortune
		return fortuneService.getFortune();
	}

	
}
