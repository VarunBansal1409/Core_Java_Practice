package com.method_overloading;

// change in the order

public class Test1 {
	
	void m1(int a , float b) {
		System.out.println(a + b);
	}
	
	void m1(float a , int b) {
		System.out.println(a - b);
	}
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		
		t1.m1(19 , 21.89f);
		t1.m1(25.2f, 11);
	}
	
}
