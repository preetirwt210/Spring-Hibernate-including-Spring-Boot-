package com.iluvcoding.springdemo;

public class CricketCoach implements Coach {
 
	private String emailAddress;
	private String team;
	
	FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg Constructor");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method ->setFortuneService");
		this.fortuneService = fortuneService;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setter method ->setEmailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setter method ->setTeam");
		this.team = team;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
