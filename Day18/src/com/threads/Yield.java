package com.threads;

public class Yield extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("iam user-defined thread");
			} catch (InterruptedException e) {

			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Yield t1 = new Yield();
		t1.start();
		Thread.yield();

		for (int i = 1; i <= 10; i++) {
			System.out.println("iam main thread");
		}

	}

}
