package com.enes.springdemo;

public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return " Score 2 goals in a game!";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
