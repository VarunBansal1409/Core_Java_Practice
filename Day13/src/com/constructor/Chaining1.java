package com.constructor;

public class Chaining1 {

	Chaining1(int a){
		System.out.println("Java");
	}
	
	Chaining1(){
		this(108);
		System.out.println("Python");
	}
	
	public static void main(String[] args) {
		
		Chaining1 c1 = new Chaining1();
		
	}
	
}
