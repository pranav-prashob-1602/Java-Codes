package com.pranav.threads;


class P extends Thread {
	public void run() {
		System.out.println("P "+Thread.currentThread().getName() +" "+ Thread.currentThread().getPriority());
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		
		/*
		 * 
		 * DEFAULT PRIORITY IS 5.
		 * 
		 * 1) MIN_PRIORITY		(1)
		 * 2) NORM_PRIORITY	(5)
		 * 3) MAX_PRIORITY		(10)
		 * 
		 * Priority can range between 1-10, but in normal case we can work with the above priorities only.
		 * 
		 */
		
		P a = new P();
		P b = new P();
		a.setPriority(Thread.NORM_PRIORITY);
		b.setPriority(Thread.MIN_PRIORITY);
		a.start();
		b.start();
	}

}
