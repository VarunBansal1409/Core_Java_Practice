package com.constructor;

public class Chaining {
	
	Chaining(){
		System.out.println("Hello World");
	}
	
	Chaining(int a){
		this();
		System.out.println("Bye Bye World");
	}
	
	public static void main(String[] args) {
		
		Chaining c1 = new Chaining(108);
		
	}
	
}
