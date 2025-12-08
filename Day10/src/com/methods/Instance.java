package com.methods;

public class Instance {
	
//	Instance Method
	
	void m1() {
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		
		// by using object
		
		new Instance().m1();
		
		// by using object reference
		
		Instance i = new Instance();
		i.m1();
	}
}
