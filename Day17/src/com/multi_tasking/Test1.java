package com.multi_tasking;

//create a user-defined thread
public class Test1 extends Thread {

	// creating logic for user defined thread
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("iam a user-defined thread");
		}
	}

	public static void main(String[] args) {

		// create a object for Test1 class
		Test1 t1 = new Test1();  //creating a object for test1 class
		t1.start();  // new thread is created by JVM

		System.out.println("=================");
		t1.run();

	}
}
