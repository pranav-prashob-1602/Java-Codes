package com.pranav.designPatterns.behavioural.mediatorPattern;

public interface IATC {
	
	boolean isAvailable = true;
	
	void registerFlight(Flight f);
	void registerRunway(Runway r);
	boolean availabilityStatus();
	void setAvailability(boolean status);
}
