package com.pranav.designPatterns.behavioural.mediatorPattern;

public class Runway implements Command{
	
	private String rno;
	private IATC mediator;
	
	public Runway(String rno, IATC mediator) {
		this.rno = rno;
		this.mediator = mediator;
	}
	
	public void land() {
		System.out.println("Land at " + rno);
	}
	
	public void hover() {
		System.out.println("Hover over " + rno);
	}
	
	public void fly() {
		System.out.println("Depart from " + rno);
	}
}
