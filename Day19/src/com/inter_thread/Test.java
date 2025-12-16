package com.inter_thread;

public class Test extends Thread {
	int sum = 0;

	// create logic for user-defined thread
	public void run() {
		synchronized (this) {
			System.out.println("child thread started and writting logic");
			for (int i = 1; i <= 100; i++) {
				sum = sum + i;
			}
			System.out.println("logic completed and notify send to the main thread");
			this.notify();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Test s1 = new Test();
		s1.start();

		
		synchronized (s1) {

			System.out.println("main thread received notify and went to waiting state");
			s1.wait(); // make to wait the main thread
			System.out.println("main thread waiting completed and logic complented");
			System.out.println(s1.sum);

		}

	}

}

// note : wait() and notify() method are defined in Object class
	// wait() and notify() method can be called only inside synchronized block
	// wait() method is used to make the current thread into waiting state until
	// notify() method is used to wake up the waiting thread
// here the process is : the main thread will wait until the child thread
	// completes its logic and send notify to the main thread	
	// after receiving notify the main thread will come out from waiting state and
	// continue its remaining logic