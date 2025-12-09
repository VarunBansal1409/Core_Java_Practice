package com.method_overloading;

// change in no of formal parameters

public class Test {

	void m1(int a) {
		System.out.println(a + a);
	}
	
	void m1(int a , int b) {
		System.out.println(a + b);
	}
	
	void m1(int a , int b , int c) {
		System.out.println(a + b + c);
	}
	
	void m1() {
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		
		Test t1 = new Test();
		
		t1.m1();
		t1.m1(10, 40);
		t1.m1(99);
		t1.m1(23, 37, 17);
	}
	
}
