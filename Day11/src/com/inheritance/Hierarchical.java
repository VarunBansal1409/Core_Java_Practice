package com.inheritance;

//hierarchical inheritance

class Vehicle1 {
	String engine = "start engine";
}

class Car1 extends Vehicle1 {
	int tyres = 4;
}

class Bike extends Vehicle1 {
	int tyres = 2;
}

public class Hierarchical {

	public static void main(String[] args) {

		// create a object vehicle1 class
		Vehicle1 v1 = new Vehicle1();
		System.out.println(v1.engine);

		System.out.println("==========");
		// create a object car1 class
		Car1 c1 = new Car1();
		System.out.println(c1.tyres);
		System.out.println(c1.engine);

		System.out.println("=========");
		// create a object for bike class
		Bike b1 = new Bike();
		System.out.println(b1.tyres);
		System.out.println(b1.engine);
	}
}
