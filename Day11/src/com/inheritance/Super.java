package com.inheritance;

class A {
	String name = "abhi";
	int sno = 101;
}

class B extends A {
	String name = "ramu";
	int sno = 102;

	void m1() {
		// accessing the variables of A class using super keyword
		System.out.println(super.name);
		System.out.println(super.sno);
	}

}

public class Super {

	public static void main(String[] args) {
		// create a object for B class
		B b1 = new B();
		System.out.println(b1.name);
		System.out.println(b1.sno);
		b1.m1();
	}
}
