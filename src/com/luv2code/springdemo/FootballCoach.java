package com.luv2code.springdemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Football Coach daily workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


}
