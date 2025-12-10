package com.casting;

class Vehicle{
	void start() {
		System.out.println("Engine Started");
	}
}

class Car extends Vehicle
{
	int tyres = 4;
}

class Bike extends Car{
	
	int price = 89999;
	
}

public class Upcasting {

	public static void main(String[] args) {
		
		// upcasting
		
		Vehicle v1 = new Car();
		v1.start();
//		System.out.println(v1.tyres);
		
		Vehicle v2 = new Bike();
		v2.start();
//		System.out.println(v2.price);
		
		Car c1 = new Bike();
		System.out.println(c1.tyres);
		c1.start();
//		System.out.println(c1.price);
	}
	
}
