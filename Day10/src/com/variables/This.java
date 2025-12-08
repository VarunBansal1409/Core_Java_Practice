package com.variables;

public class This {
	
	// instance variable
	
	int a = 10;
	
	void m1(int a) {
		System.out.println(a);
		System.out.println(this.a); // accessing instance variable using this keyword
	}
	
	public static void main(String[] args) {
		
		This t = new This();
		t.m1(100);
//		System.out.println(t.a);
		
	}
}
