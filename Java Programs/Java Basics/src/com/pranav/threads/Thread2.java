package com.pranav.threads;

public class Thread2 extends Thread{
	Table t;
	
	public Thread2(Table t) {
		this.t = t;
	}
	
	public void run() {
//		Table t = new Table(); When more than one threads are accessing a synchronized block/method, they should acquire the same object lock.
//		t.display(11);
		Table.display2(11);
	}

}