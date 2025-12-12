package com.abstraction;

abstract class Emp {
	int eno = 101;
	static String ename = "ramu";

	void m1() {
		System.out.println("iam concrete class");
	}

	static void m2() {
		System.out.println("iam a static method");
	}

	Emp() {
		System.out.println("iam a constructor");
	}

	abstract void m3();
}

class Dept extends Emp {
	void m3() {
		System.out.println("iam overriding abstract method");
	}
}

public class Test2 {
	public static void main(String[] args) {
		Emp e1 = new Dept(); // up-casting
		System.out.println(e1.eno);
		System.out.println(Emp.ename);
		e1.m1();
		Emp.m2();
		e1.m3();
	}
}
