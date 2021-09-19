package com.pranav.inheritance;

public class GraduateStudent extends Student {
	
	String disc;
	
	public GraduateStudent(String disc, String name, int std) {
		super(std, name);
		this.disc=disc;
		this.name=name;
		this.std=std;
	}

	public String getDisc() {
		return disc;
	}

	public void setDisc(String disc) {
		this.disc = disc;
	}
}
