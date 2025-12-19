package com.thread;

public class Main {

	public static void main(String[] args) {

		Runnable r1 = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("User Defined Thread 1: " + i);
			}
		};

		Thread t1 = new Thread(r1);
		t1.start();
		
		
		

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread: " + i);
		}

	}

}

// Here, we create a user-defined thread using a lambda expression that implements the Runnable interface. 
//	The main thread and the user-defined thread run concurrently, printing their respective messages.