package com.pranav.designPatterns.behavioural.iteratorPattern;

public class IteratorRunner {

	public static void main(String[] args) {
		NamesRepository n = new NamesRepository();
		
		Iterator i = n.getIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
	}

}
