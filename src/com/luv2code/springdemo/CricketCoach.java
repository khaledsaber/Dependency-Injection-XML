package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	
	private String emailAddress;
	
	private String team;

	private FortuneService fortuneService;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("inside cricket coach constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Cricket Coach daily workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	

	public void setFortuneService(FortuneService fortuneService) {

		System.out.println("inside setFortuneService function");
		this.fortuneService = fortuneService;
	}

	
	
}
