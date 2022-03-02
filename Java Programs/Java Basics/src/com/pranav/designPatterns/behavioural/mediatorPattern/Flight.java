package com.pranav.designPatterns.behavioural.mediatorPattern;

public class Flight implements Command{
	String fno;
	IATC mediator;
	
	public Flight(String fno, IATC mediator) {
		this.fno = fno;
		this.mediator = mediator;
	}
	
	public void land() {
		if(mediator.availabilityStatus()==true) {
			System.out.println(fno + " Landed successfully");
			mediator.setAvailability(false);
			return;
		}
		System.out.println(fno + " Waiting for runway to be cleared for Landing");
	}
	
	public void readyToLand() {
		System.out.println(fno + " Landing Initiated");
	}
	
	public void parked() {
		System.out.println(fno + " Plane has been successfully Parked");
		mediator.setAvailability(true);
	}
	
	public void hover() {
		System.out.println("Hover " + fno);
	}
	
	public void fly() {
		System.out.println("Depart " + fno);
	}
	
}
