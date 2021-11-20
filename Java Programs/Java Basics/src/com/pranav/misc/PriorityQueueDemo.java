package com.pranav.misc;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq= new PriorityQueue(Comparator.reverseOrder());
		pq.add(5);
		pq.add(2);
		pq.add(-1);
		pq.add(9);
		System.out.println(pq);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
	}

}
