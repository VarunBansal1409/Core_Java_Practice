package com.multi_tasking;

public class Test6 implements Runnable {

	public void run() {
		System.out.println("user-defined thread: " + Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(5);
		System.out.println("user-defined thread: " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {

		System.out.println("main-defined thread: " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println("main-defined thread: " + Thread.currentThread().getPriority());
		
		//CALL THE start() at last 
		Test6 t6 = new Test6();
		t6.run();

	}

}
