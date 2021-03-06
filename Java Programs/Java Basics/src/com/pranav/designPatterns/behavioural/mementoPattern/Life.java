package com.pranav.designPatterns.behavioural.mementoPattern;

public class Life {
	int age;
	String time;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
		System.out.println("Setting Age to Memento");
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
		System.out.println("Setting Time to Memento");
	}
	
	void restoreFromMemento(Memento obj) {
		this.time = obj.getSavedTime();
		this.age = obj.getSavedAge();
		System.out.println(age + "  " + time);
	}
	
	Memento saveToMemento() {
		System.out.println("Saving to Memento");
		return new Memento(age, time);
	}
	
	
}
