package com.pranav.designPatterns.behavioural.statePattern;

public class Ringing implements MobileAlertState {
	
	public void alert() {
		System.out.println("Ringing");
	}
}
