package com.threads;

public class Join extends Thread {

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

		Join t1 = new Join();
		t1.start();
		t1.join(5000);

		for (int i = 1; i <= 10; i++) {
			System.out.println("iam a main thread");
		}

	}

}
