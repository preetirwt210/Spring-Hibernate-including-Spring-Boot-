package com.iluvcoding.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		
		return "Today is your Good day" ;
	}

}
