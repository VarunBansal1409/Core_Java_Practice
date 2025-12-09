package com.access_modifers;

//default access modifier in different class within same package

public class Test_Default {
	
	public static void main(String[] args) {
		
		Default d1 = new Default();
		System.out.println(d1.ino);
		System.out.println(d1.iname);
		d1.m1();
		
	}

}
