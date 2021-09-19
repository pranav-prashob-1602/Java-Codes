package com.pranav.threads;

class MyThread1 extends Thread {
	public void run() {
		
		try {
			this.join();		// one of the most important Deadlock situation, here the thread tells itself to stop and finish at the same time. (sempxy paradox)
		}catch(Exception e) {
			System.out.println(e);
		}
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}
}

public class ThreadDemoJoin {

	public static void main(String[] args) throws InterruptedException {
				
		MyThread1 t = new MyThread1();
		t.start();
		t.join();
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
