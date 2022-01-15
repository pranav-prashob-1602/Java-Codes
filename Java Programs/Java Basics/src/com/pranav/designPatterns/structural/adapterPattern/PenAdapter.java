package com.pranav.designPatterns.structural.adapterPattern;

public class PenAdapter implements Pen {
	PilotPen p=new PilotPen();
	
	public void write(String s) {
		p.mark(s);
	}
}
