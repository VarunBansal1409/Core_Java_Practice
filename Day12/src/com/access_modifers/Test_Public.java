package com.access_modifers;

// public access modifier in different class within same package

public class Test_Public {
	
	public static void main(String[] args) {
		
		Public p1 = new Public();
		System.out.println(p1.sno);
		System.out.println(p1.sname);
		p1.m1();
		
	}
	
}
