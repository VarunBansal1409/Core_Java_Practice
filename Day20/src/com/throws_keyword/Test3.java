package com.throws_keyword;

public class Test3 {

	void m1() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("m1 method callled");
	}

	void m2() throws InterruptedException {
		System.out.println("m2 method called");
		m1();
	}

	void m3() throws InterruptedException {
		System.out.println("m3 method called");
		m2();
	}

	public static void main(String[] args) throws InterruptedException {

		Test3 t3 = new Test3();
		t3.m3();

	}

}

// note: throws keyword is used in method declaration to specify that a method can throw one or more exceptions.
	// here, each method declares that it throws InterruptedException,