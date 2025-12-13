package com.multi_tasking;

public class Test2 extends Thread {

	// create a user-defined thread
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("user-defined thread");
		}
	}

	public static void main(String[] args) {

		// object is created
		Test2 t2 = new Test2();

		// t2.start(); // new thread is created by jvm (not predictable)

		t2.run();

		// create a logic for main thread
		for (int i = 1; i <= 10; i++) {
			System.out.println("main thread");
		}

	}

}
