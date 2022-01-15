package com.pranav.designPatterns.structural.adapterPattern;

public class School {
	public static void main(String[] args) {
		AssignmentWork w = new AssignmentWork();
		Pen p = new PenAdapter();
		w.setP(p);
		w.writeAssignment("Assignment is boring");
	}
}
