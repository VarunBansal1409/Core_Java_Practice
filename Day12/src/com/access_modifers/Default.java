package com.access_modifers;

//default access modifier within same class and same package

public class Default {

	int ino = 101;
	String iname = "Karan";
	
	void m1() {
		System.out.println("i am an instance method using default access modifer");
	}
	
	public static void main(String[] args) {
		
		Default d1 = new Default();
		System.out.println(d1.ino);
		System.out.println(d1.iname);
		d1.m1();
		
	}
	
}
