package com.method_overloading;

public class Demo1 {

	private void m1() {
		System.out.println("i am a private method");
	}
	
	static void m1(int a) {
		System.out.println("i am a static method " + a);
	}
	
	final void m1(float a) {
		System.out.println("i am a final method " + a);
	}
	
	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		
		d1.m1();
		d1.m1(108);
		d1.m1(10.8f);
	}
	
}
