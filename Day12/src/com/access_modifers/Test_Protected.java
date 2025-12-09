package com.access_modifers;

//protected access modifier in different class within same package

public class Test_Protected {
	
	public static void main(String[] args) {
		
		Protected p2 = new Protected();
		System.out.println(p2.pno);
		System.out.println(p2.pname);
		p2.m1();
		
	}
	
}
