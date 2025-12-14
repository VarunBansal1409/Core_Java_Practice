package com.threads;

public class Sleep extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("iam user-defined thread");
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String[] args) {

		Sleep t2 = new Sleep();
		t2.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("iam a main thread");
		}

	}

}
