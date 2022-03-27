package com.pranav.designPatterns.behavioural.mementoPattern;

import java.util.*;

public class MementoRunner {

	public static void main(String[] args) {
		List<Memento> m = new ArrayList<Memento>();
		
		Life l = new Life();
		for(int i=0;i<5;i++) {
			l.setAge(19+i*3);
			l.setTime(Integer.toString(i*8+12));
			m.add(l.saveToMemento());			
		}
		
		l.restoreFromMemento(m.get(3));
		
	}

}
