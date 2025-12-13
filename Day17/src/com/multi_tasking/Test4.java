package com.multi_tasking;

interface A {

}

public class Test4 implements Runnable, A { // multiple inheritance is possible

	// create a user defined thread
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("user-dfeined thred");
		}
	}

	public static void main(String[] args) {

		Test4 t4 = new Test4();
//		t4.run();

		Thread res = new Thread(t4);
		res.start();

		// create a main thread
		for (int i = 1; i <= 10; i++) {
			System.out.println("pre-dfeined thred");
		}

	}

}
