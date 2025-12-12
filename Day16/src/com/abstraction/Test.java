package com.abstraction;

abstract class Demo {
	// Concrete class
	void m1() {
		System.out.println("iam a concrete class");
	}

	// abstract class
	abstract void m2();
}

class Demo1 extends Demo // implemented class override abstract method
{
	@Override
	void m2() {
		System.out.println("iam overrinding abstract method");
	}
}

public class Test {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.m1();
		d1.m2();

		System.out.println("========");
		Demo d = new Demo1(); // upcasting (run-time polymorphism)
		d.m1();
		d.m2();
	}

}
