package com.method_overriding;

class Vehicle {
	void start() {
		System.out.println("Vehicle Started");
	}
}

class Car extends Vehicle {
	@Override
	void start() {
		System.out.println("Car Started");
	}
}

class Bike extends Vehicle {
	@Override
	void start() {
		System.out.println("Bike Started");
	}
}

public class Demo2 {

	public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.start();
		Vehicle v2 = new Bike();
		v2.start();
	}

}
