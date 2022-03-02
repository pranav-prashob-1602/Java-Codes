package com.pranav.designPatterns.behavioural.mediatorPattern;

public class Airport {

	public static void main(String[] args) {
		IATC mediator = new ATC();
		Flight f1 = new Flight("6E 2022", mediator);
		Flight f2 = new Flight("6E 2021", mediator);
		Runway r = new Runway("R1", mediator);
		
		mediator.registerFlight(f1);
		mediator.registerRunway(r);
		
		f1.readyToLand();
		mediator.setAvailability(true);
		f1.land();
		f2.land();
		f1.parked();
		f2.land();
		
	}

}
