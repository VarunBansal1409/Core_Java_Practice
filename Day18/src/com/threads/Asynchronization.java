package com.threads;

class ClassRoom1 {
	 void takeClass(String faculty) { // asynchronization method without synchronized keyword which is inconsistent
		for (int i = 1; i <= 10; i++) {
			System.out.println("faculty taken class name is: " + faculty);
		}
	}
}

public class Asynchronization extends Thread {

	// data members

	String faculty;
	ClassRoom1 c1;

	// constructor
	Asynchronization(String faculty, ClassRoom1 c1) {
		this.faculty = faculty;
		this.c1 = c1;
	}

	// write user-defined thread
	public void run() {
		// call the takeClass()
		c1.takeClass(faculty);
	}

	public static void main(String[] args) {

		ClassRoom1 c1 = new ClassRoom1();
		Asynchronization res1 = new Asynchronization("Ramu", c1);
		Asynchronization res2 = new Asynchronization("abhi", c1);
		res1.start();
		res2.start();

	}

}
