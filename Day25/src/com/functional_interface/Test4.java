package com.functional_interface;

@FunctionalInterface
interface A4
{
 	default void m1() {		
		System.out.println("I am Default and Instance Method");
	}
	
	public static void m2() {
		System.out.println("I am Static Method");
	}
	
	public abstract void m3();
}

class Demo4 implements A4
{

	@Override	// implementing abstract method
	public void m3() {
		System.out.println("I am abstract Method from implmented class");
	}
	
}

public class Test4 {

	public static void main(String[] args) {
		
		A4 a4 = new Demo4();	// upcasting
		
		a4.m1();  // calling default and instance method
		A4.m2();  // calling static method
		a4.m3();  // calling abstract method from implemented class
		
	}
	
}
