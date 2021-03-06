package com.pranav.threads;

class SharedData {
	private int data;
	private boolean writable=true;	//Semaphore Variable
	
	public synchronized void produce(int x) {
		if(writable==false) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		data=x;
		System.out.println("Produced: "+x);
		writable=false;
		notify();
	}
	
	public synchronized int consume() {
		if(writable) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		writable=true;
		notify();
		return data;
	}
	
}

class Producer extends Thread {
	SharedData d;
	
	public Producer(SharedData d) {
		this.d=d;
	}
	
	public void run() {
		for(int i=1;i<=10;i++) {
				d.produce(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
}

class Consumer extends Thread {
	SharedData d;
	
	public Consumer(SharedData d) {
		this.d=d;
	}
	
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Consumed Value is: "+d.consume());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class ProducerConsumerRunner {

	public static void main(String[] args) {
		SharedData d = new SharedData();
		Producer p = new Producer(d);
		Consumer c = new Consumer(d);
		p.start();
		c.start();
	}

}
