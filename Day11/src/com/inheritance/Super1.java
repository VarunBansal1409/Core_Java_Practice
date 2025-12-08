package com.inheritance;

class A1 {
	// instance variable
	String name = "anil";

	// static variable
	static int a = 10;

	// instance method
	void test() {
		System.out.println("iam instance method");
	}

	// static method
	static void m1() {
		System.out.println("iam static method");
	}
}

class B1 extends A1 {
	String name = "ramu";

	static int a = 100;

	void res() {
		System.out.println(super.name);
		System.out.println(A1.a);
		super.test();
		A1.m1();
	}
}

public class Super1 {

	public static void main(String[] args) {

		// create a object for B1 class
		B1 b = new B1();
		System.out.println(b.name);
		System.out.println(B1.a);
		b.res();

	}
}
