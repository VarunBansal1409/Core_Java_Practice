package com.throws_keyword;

public class Test4 {

	void student() throws InterruptedException {
		System.out.println("student called");
		Thread.sleep(1000);
	}

	void hod() throws InterruptedException {
		System.out.println("hod called");
		student();
	}

	void principal() throws InterruptedException {
		System.out.println("principal called");
		hod();
	}

	public static void main(String[] args) throws InterruptedException {

		Test4 t4 = new Test4();
		t4.principal();

	}
}

//note: throws keyword is used in method declaration to specify that a method can throw one or more exceptions.
	// here, each method declares that it throws InterruptedException,
