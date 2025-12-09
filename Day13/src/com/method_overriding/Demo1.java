package com.method_overriding;

class A {
	void m1() {
		System.out.println("Java Full Stack");
	}
}

class B extends A{
	
	@Override
	void m1() {
		super.m1();
		System.out.println("MERN Stack"); 
	}
}

public class Demo1 {

	public static void main(String[] args) {

//		A a1 = new A();
//		a1.m1();

		B b1 = new B();
		b1.m1();
	}

}
