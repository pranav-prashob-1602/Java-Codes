package com.pranav.designPatterns.behavioural.mementoPattern;

public class Memento {
	int savedAge;
	String savedTime;
	
	Memento(int savedAge, String savedTime) {
		this.savedAge = savedAge;
		this.savedTime = savedTime;
	}
	
	int getSavedAge() {
		return savedAge;
	}
	
	String getSavedTime() {
		return savedTime;
	}
	
}
