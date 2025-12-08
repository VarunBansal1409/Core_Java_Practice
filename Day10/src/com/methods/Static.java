package com.methods;

public class Static {
	
	static void m1() {
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		
		// by using object
		new Static().m1();
		
		// by using object reference
		Static s = new Static();
		s.m1();
		
		// by using directly
		m1();
		
		// by using class name
		Static.m1();
		
	}
}
