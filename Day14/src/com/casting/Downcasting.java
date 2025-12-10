package com.casting;

class A {
	
	String s1 = "Java";
			
}

class B extends A{
	String s2 = "Python";
}

public class Downcasting {

	public static void main(String[] args) {
		
		// Downcasting
		
//		first: upcasting
		A a1 = new B();
//		second: downcasting
		B b1 = (B) a1;
		
		System.out.println(b1.s1);
		System.out.println(b1.s2);
		
	}
	
}
