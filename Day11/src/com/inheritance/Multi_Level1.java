package com.inheritance;

//multi level inheritance

class Vehicle {
	String engine = "engine starts";
}

class Car extends Vehicle {
	int tyres = 4;
}

class Bmw extends Car {
	int price = 1000;
}

public class Multi_Level1 {

	public static void main(String[] args) {
		// create object for vehicle
		Vehicle v1 = new Vehicle();
		System.out.println(v1.engine);

		// create a object for car
		System.out.println("===========");
		Car c1 = new Car();
		System.out.println(c1.tyres);
		System.out.println(c1.engine);

		System.out.println("===========");
		// create object for BMW class
		Bmw b1 = new Bmw();
		System.out.println(b1.price);
		System.out.println(b1.tyres);
		System.out.println(b1.engine);
	}
}
