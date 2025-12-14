package com.threads;

public class Daemon extends Thread {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName()); // main
		System.out.println(Thread.currentThread().isDaemon()); //false
//		Thread.currentThread().setDaemon(true); // IllegalThreadStateException
		System.out.println(Thread.currentThread().isDaemon()); 

	}

}
// Note: The above code will throw an IllegalThreadStateException at runtime because the main thread
//			cannot be set as a daemon thread once it has started executing.