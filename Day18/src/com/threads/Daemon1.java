package com.threads;

public class Daemon1 extends Thread {

	public void run()
	{
		System.out.println(Thread.currentThread().getName()); //thread-0
		System.out.println(Thread.currentThread().isDaemon());  // not false because we set daemon true in main
	}
	
	public static void main(String[] args) {
		
		Daemon1 t5 = new Daemon1();
		t5.setDaemon(true);
		System.out.println(t5.isDaemon());
		t5.start();
		
	}
	
}
