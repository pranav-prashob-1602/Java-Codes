package com.pranav.designPatterns.creational.singletonPattern;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private static Singleton s;
	
	private Singleton() {
		
	}
	
	public static synchronized Singleton getInstance() {
		if(s==null) {
			s = new Singleton();
		}
		return s;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
//		return super.clone();
	}
	
	protected Object readResolve() {
		return s;
	}
	
	
}
