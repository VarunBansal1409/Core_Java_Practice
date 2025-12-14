package com.threads;

public class DeadLock extends Thread {

	// declare a static thread
	static Thread t1;

	// write the logic for user-defined thread
	public void run() {
		try {
			t1.join();
		} catch (Exception e) {

		}
		for (int i = 1; i <= 10; i++) {
			System.out.println("iam a user-defined thread");
		}
	}

	public static void main(String[] args) throws InterruptedException {

		// System.out.println(Thread.currentThread().getName()); //main
		t1 = Thread.currentThread();
//	    System.out.println(t1.getName());  //main

		DeadLock t7 = new DeadLock();
		t7.start();
		t7.join();

		for (int i = 1; i <= 10; i++) {
			System.out.println("iam a main thread");
		}

	}

}

// note : here, the main thread is waiting for the user-defined thread to complete its execution 
//			using join() method.
//			thus, deadlock occurs as both threads are waiting for each other to complete their execution.