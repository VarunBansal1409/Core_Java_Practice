package com.method;

import java.util.Arrays;

public class Demo {
	
	void m1(){
		System.out.println("Hello World");
	}
	
	int m2() {
		return 10;
	}
	
	String m3(){
		return "Java";
	}
	
	void m4(int a, int b) {
		System.out.println(a + b);
	}
	
	void m5(int[] c) {
		System.out.println(Arrays.toString(c));
	}
	
	public static void main(String[] args) {
		// create a object for class
		Demo d1 = new Demo();
		
		d1.m1();
		
		System.out.println(d1.m2());
		
		System.out.println(d1.m3());
		
		d1.m4(11,11);
		
		int[] res = {10,20,30,40,50};
		d1.m5(res);
	}
}
