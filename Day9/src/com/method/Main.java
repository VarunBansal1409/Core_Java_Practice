package com.method;

public class Main {
	
	void m1(int a , int b) {
		System.out.println(a - b);
	}
	
	int m2(int a, int b) {
		return a + b;
	}
	
	void m3() {
		System.out.println("Jai Shree Ram");
	}
	
	String m4() {
		return "Java";
	}
	
	public static void main(String[] args) {
		
//		Create a Object for class
		
		Main m = new Main();
		
		// with formal parameters and without return keyword
		m.m1(11, 7);	
		
		// with formal parameters and with return keyword
		System.out.println(m.m2(108, 11));
		
		// without formal parameters and without return keyword
		m.m3();
		
		// without formal parameters and with return keyword
		System.out.println(m.m4());
	}	
}
