package com.iluvcoding.springdemo;

	public class BaseballCoach  implements Coach{
	
		//define private field for dependencies
		FortuneService fortuneService;
		
		//define constructor for dependecy injection
		public BaseballCoach(FortuneService theFortuneService) {
			fortuneService=theFortuneService;
		}
		
		
		public String getDailyWorkout() {
			return "Spend 30mins on batting practice";
		}

		@Override
		public String getDailyFortune() {
			return fortuneService.getDailyFortune();
		}
		
	}
