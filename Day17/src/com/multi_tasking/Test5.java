package com.multi_tasking;

public class Test5 extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName()); // thread-0
		Thread.currentThread().setName("ramu");
		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {

		Test5 t5 = new Test5();
		System.out.println(t5.getName());
		t5.setName("kumar");
		System.out.println(t5.getName());

		t5.start();

		System.out.println(Thread.currentThread().getName()); // main
		Thread.currentThread().setName("excelr");
		System.out.println(Thread.currentThread().getName());

	}
}
