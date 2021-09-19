package com.pranav.threads;

class MyThread extends Thread {
	public void run() {
		int c;
		c=10/0;
	}
}

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();	// calling start() creates a thread in the thread pool, not instantiating the object 
	}

}
