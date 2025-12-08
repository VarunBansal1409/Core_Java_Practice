package com.variables;

public class Local1 {
	
	void m1(int a, String str, double d) {
		System.out.println("no: "+a);
		System.out.println("name: "+str);
		System.out.println("salary: "+d);
	}
	
	public static void main(String[] args) {
		
		Local1 l = new Local1();
		l.m1(1, "Vishal", 100000);
	}

}
