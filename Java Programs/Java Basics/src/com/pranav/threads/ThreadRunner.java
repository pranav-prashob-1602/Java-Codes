package com.pranav.threads;

public class ThreadRunner {

	public static void main(String[] args) {
		A t1 = new A();
		t1.setName("Humans");
		
		B t2 = new B();
		t2.setName("Ghoul");

		D obj=new D();
		Thread t3=new Thread(obj);
		t3.setName("Baka");
		
		t1.start();
		
		t2.start();
		t3.start();
		try {
			System.out.println(t1.getName()+" "+t1.isAlive());
			System.out.println(t2.getName()+" "+t2.isAlive());
			System.out.println(t3.getName()+" "+t3.isAlive());
//			t1.join(100000);
			t2.join(100000);
			System.out.println("2 "+t1.getName()+" "+t1.isAlive());
			System.out.println("2 "+t2.getName()+" "+t2.isAlive());
			System.out.println("2 "+t3.getName()+" "+t3.isAlive());
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("3 "+t1.getName()+" "+t1.isAlive());
		System.out.println("3 "+t2.getName()+" "+t2.isAlive());
		System.out.println("3 "+t3.getName()+" "+t3.isAlive());
		
//		TCP/IP concurrent servers.
//		P.S Baka means "IDIOT".
	}

}
