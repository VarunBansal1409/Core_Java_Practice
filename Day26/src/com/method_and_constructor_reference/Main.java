package com.method_and_constructor_reference;

@FunctionalInterface
interface Demo {
	public abstract void m1();
}

class Sample {
	// static method
	static void m2() {
		System.out.println("iam a static method");
	}

	// instance method
	void m3() {
		System.out.println("iam instance method");
	}

	Sample() {
		System.out.println("iam a constructor");
	}
}

public class Main {

	public static void main(String[] args) {

		// call static method

		Demo d1 = Sample::m2;
		d1.m1();

		// call instance method
		Sample s1 = new Sample();

		Demo d2 = s1::m3;
		d2.m1();

		// call the constructor
		Demo d3 = Sample::new;
		d3.m1();

	}

}
