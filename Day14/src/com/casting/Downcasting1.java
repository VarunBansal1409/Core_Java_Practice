package com.casting;

class Vehicle1 {
	void start() {
		System.out.println("Vehicle Started");
	}
}

class Car1 extends Vehicle1 {
	int tyres = 4;
}

class Bike1 extends Car1 {

	int price = 89999;

}

public class Downcasting1 {

	public static void main(String[] args) {
//	Downcasting	

		// first:upcasting
		Vehicle1 v1 = new Car1();
		// second:downcasting    
		Car1 c1 = (Car1) v1;
		c1.start();
		System.out.println(c1.tyres);
		
		// first:upcasting
		Car1 c2 = new Car1();
		// second:downcasting
		Bike1 b1 = (Bike1) c2;
		b1.start();
		System.out.println(b1.tyres);
		System.out.println(b1.price);
	}

}
