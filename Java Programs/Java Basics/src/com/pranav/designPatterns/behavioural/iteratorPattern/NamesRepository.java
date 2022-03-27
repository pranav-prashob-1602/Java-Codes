package com.pranav.designPatterns.behavioural.iteratorPattern;

import java.util.*;


public class NamesRepository implements Container {
	List<String> names = new ArrayList<String>();
	
	private class NameIterator implements Iterator {
		int index;
		
		NameIterator() {
			index = 0;
		}
		
		public boolean hasNext() {
			return index!=names.size();
		}
		
		public Object next() {
			if(this.hasNext()) {
				return names.get(index++);
			}
			return null;
		}
		
	}
	
	NamesRepository() {
		for(int i=0;i<10;i++) {
			names.add("A" + i + " B" + i*3);			
		}
	}
	
	public Iterator getIterator() {
		return new NameIterator();
	}
}
