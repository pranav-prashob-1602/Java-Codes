package com.pranav.designPatterns.behavioural.mediatorPattern;

public class ATC implements IATC {
	
	private Runway rw;
	private Flight fl;
	private boolean isAvail;
	
	public void registerFlight(Flight f) {
		fl = f;
	}
	
	public void registerRunway(Runway r) {
		rw = r;
	}
	
	public void setAvailability(boolean status) {
		isAvail = status;
	}
	
	public boolean availabilityStatus() {
		return isAvail;
	}
	
}
