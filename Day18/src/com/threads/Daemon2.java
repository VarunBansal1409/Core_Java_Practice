package com.threads;

public class Daemon2 extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("iam user-defined thread");
			} catch (InterruptedException e) {

			}
		}
	}

	public static void main(String[] args) {

		Daemon2 t6 = new Daemon2();
		t6.setDaemon(true);  //converting user-defined thread into daemon thread
		t6.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("iam a main thread");
		}

	}

}

// note : here, the user-defined thread is a daemon thread. So, when the main thread completes its execution, 
//			the JVM will terminate the daemon thread even if it has not completed its execution. 
//			Hence, you may not see all the "iam user-defined thread" messages printed.