package com.pranav.designPatterns.behavioural.statePattern;

public class Mobile {
	public static void main(String[] a) {
		MobileContext mcxt = new MobileContext();
		mcxt.alert();
		mcxt.setState(new Silent());
		mcxt.alert();
		mcxt.setState(new Ringing());
		mcxt.alert();
	}
}