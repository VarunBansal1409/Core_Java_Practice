package com.variable;

public class Instance {
	
//	Instance variable
	
	int a = 108;
	String b = "Jai Shree Ram";
	float c = 11.11f;
	
	public static void main(String[] args) {
		
		// by using object
		
		System.out.println(new Instance().a);
		System.out.println(new Instance().b);
		System.out.println(new Instance().c);
		
		System.out.println("======================");
		
		// by using object reference 
		
		Instance i = new Instance();
		
		System.out.println(i.c);
		System.out.println(i.b);
		System.out.println(i.a);
		
	}
}
