package com.pranav.designPatterns.behavioural.observerPattern;

public class Subscriber {
	String name;
	Channel c;
	
	public Subscriber(String name, Channel c) {
		this.name = name;
		this.c = c;
		subscribeChannel();
	}
	
	public void subscribeChannel() {
		c.subscribe(this);
	}
	
	public void unsubscribeChannel() {
		c.unSubscribe(this);
	}
	
	void update(String videoName) {
		System.out.println("Hi "+ name + " new video " + videoName +
				" has been uploaded!");
	}
	
}
