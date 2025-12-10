package com.has_a_relationship;

class Vehicle {
	void start() {
		System.out.println("vehicle started");
	}

	void stop() {
		System.out.println("vehicle stopped");
	}
}

class Bike {
	Vehicle v1 = new Vehicle();

	void running() {
		v1.start();
		System.out.println("bike running");
		v1.stop();
	}
}

public class Test {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.running();
	}
}
