package com.pranav.designPatterns.behavioural.observerPattern;

import java.util.*;

public class Channel {
	private List<Subscriber> subs = new ArrayList<Subscriber>();
	private String title;
	
	public Channel(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void subscribe(Subscriber s) {
		subs.add(s);
	}
	
	public void unSubscribe(Subscriber s) {
		s.c = null;
		subs.remove(s);
	}
	
	public void upload(String videoName) {
		this.notifySubscriber(videoName);
	}
	
	private void notifySubscriber(String videoName) {
		subs.forEach(e -> e.update(videoName));
	}
	
}
