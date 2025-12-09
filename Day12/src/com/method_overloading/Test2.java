package com.method_overloading;

// change in the data types

public class Test2 {

	void m1(int a) {
		System.out.println(a);
	}
	
	void m1(float a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Test2 t1 = new Test2();
		
		t1.m1(412);
		t1.m1(3876.3765f);
		
	}
	
}
