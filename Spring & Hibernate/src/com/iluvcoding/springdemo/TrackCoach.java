package com.iluvcoding.springdemo;

public class TrackCoach implements Coach {

	public TrackCoach() {}
	
	FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: "+ fortuneService.getDailyFortune();
	}

}
