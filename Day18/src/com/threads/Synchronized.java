package com.threads;

class ClassRoom {
	synchronized void takeClass(String faculty) { // synchronized method
		for (int i = 1; i <= 10; i++) {
			System.out.println("faculty taken class name is: " + faculty);
		}
	}
}

public class Synchronized extends Thread {

	// data members

	String faculty;
	ClassRoom c1;

	// constructor
	Synchronized(String faculty, ClassRoom c1) {
		this.faculty = faculty;
		this.c1 = c1;
	}

	// write user-defined thread
	public void run() {
		// call the takeClass()
		c1.takeClass(faculty);
	}

	public static void main(String[] args) {

		ClassRoom c1 = new ClassRoom();
		Synchronized res1 = new Synchronized("Ramu", c1);
		Synchronized res2 = new Synchronized("abhi", c1);
		res1.start();
		res2.start();

	}

}
