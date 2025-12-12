package com.interfaces;

interface A {
	// create a variable
	public static final int a = 10;

	// create a abstract
	public abstract void m1();
}

class Res implements A // implemented class we should override abstract method with public access
						// modifier
{
	@Override
	public void m1() {
		System.out.println("iam overriding abstract method");
	}
}

public class Main {

	public static void main(String[] args) {
		// create a object for implemented class
		Res s1 = new Res();
		System.out.println(Res.a);
		s1.m1();

		System.out.println("========");
		A a = new Res(); // up-casting
		System.out.println(A.a);
		a.m1();
	}

}
