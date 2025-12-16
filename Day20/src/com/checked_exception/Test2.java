package com.checked_exception;

public class Test2 {

	public static void main(String[] args) {

		// Thread.sleep(1000); //InterruptedException
		try {
			Thread.sleep(1000);
			System.out.println("thread going for 1sec sleep");
		} catch (InterruptedException e) {
			System.out.println("hello");
		}

	}
}

// note: InterruptedException is thrown when a thread is waiting, sleeping, or otherwise occupied,
//		and the thread is interrupted, either before or during the activity.
//  		here is an example of how to handle InterruptedException using a try-catch block.