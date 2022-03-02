package com.pranav.designPatterns.behavioural.statePattern;

public class Silent implements MobileAlertState {
	
	public void alert() {
		System.out.println("Silent");
	}
}

