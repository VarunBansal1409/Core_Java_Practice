package com.interfaces;

interface Car {
	void m1();
}

interface Bike {
	void m2();
}

interface Vehicle extends Car, Bike {
	void m3();
}

class Customer implements Vehicle {
	public void m1() {
		System.out.println("car started");
	}

	public void m2() {
		System.out.println("bike started");
	}

	public void m3() {
		System.out.println("vehicle started");
	}
}

public class Main3 {

	public static void main(String[] args) {
		
		//up-casting
		Vehicle v1 = new Customer();
		v1.m1();
		v1.m2();
		v1.m3();
		
	}

}
