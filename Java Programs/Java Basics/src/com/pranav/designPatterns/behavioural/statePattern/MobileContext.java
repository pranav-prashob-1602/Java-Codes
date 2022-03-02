package com.pranav.designPatterns.behavioural.statePattern;

public class MobileContext {
	MobileAlertState m;
	
	MobileContext() {
		this.m = new Ringing();
	}
	
	void alert() {
		m.alert();
	}
	
	void setState(MobileAlertState m) {
		this.m = m;
	}
	
}
