package com.iluvcoding.springAnnotations;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach{

	@Override
	public String getDailyWorkout() {
	
		return "Practice your backHand volley";
	}

}
