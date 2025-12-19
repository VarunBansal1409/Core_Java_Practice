package com.method_and_constructor_reference;

@FunctionalInterface
interface Demo1 {
	public abstract int m1(int a);
}

class Demo2 {
	static int m2(int a) {
		return a;
	}

	int m3(int a) {
		return a;
	}
	

}

public class Main2 {
	public static void main(String[] args) {

		Demo1 d1 = Demo2::m2;
		System.out.println(d1.m1(10));

		Demo2 d2 = new Demo2();
		Demo1 res = d2::m3;
		System.out.println(res.m1(100));

	}
}
