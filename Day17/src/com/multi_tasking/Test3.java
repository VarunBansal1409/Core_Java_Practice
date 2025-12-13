package com.multi_tasking;

public class Test3 implements Runnable {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("user-defined thread");
		}
	}

	public static void main(String[] args) {

		Test3 t3 = new Test3();
		t3.run();

		// implement start()
		System.out.println("============");

		Thread res = new Thread(t3); // create a object for thread and pass class reference 
		res.start();

	}

}
