package com.method_and_constructor_reference;

@FunctionalInterface
interface A1 {
	public abstract void m1(int a, int b);
}

class Sample1 {
	static void m1(int a1, int b1) {
		System.out.println(a1 + b1);
	}

	void m2(int m1, int m2) {
		System.out.println(m1 + m2);
	}
}

public class Main1 {

	public static void main(String[] args) {
		
		//call static method
		A1 a = Sample1::m1;
		a.m1(10, 10);
		
		//call instance method
		Sample1 s1 = new Sample1();
		
		A1 b = s1::m2;
		b.m1(100, 100);
		
	}

}
