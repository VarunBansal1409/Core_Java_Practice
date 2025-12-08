package com.blocks;

public class Instance {
	
	// Instance Block
	
	int a;
	static String name;
	
	{
		a = 10;
		name = "Vijay";
		System.out.println("I am an Instance Block");
	}
	
//	Instance Method
	
	void m1() {
		System.out.println("I am an Instance Method");
	}
	
//	Constructor
	
	Instance() {
		System.out.println("I am a Constructor");
	}
	
	public static void main(String[] args) {
		
		Instance i = new Instance();
		
		System.out.println(i.a);
		System.out.println(Instance.name);
		
		i.m1();
		
	}
}
