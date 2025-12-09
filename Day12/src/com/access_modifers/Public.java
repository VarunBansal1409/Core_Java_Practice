package com.access_modifers;

// public access modifier within same class and same package

public class Public {
	
	public int sno = 101;
	public String sname = "Ravi";
	
	public void m1() {
		System.out.println("I am an instance method using public access modifier");
	}
	
	public static void main(String[] args) {
		Public p1 = new Public();
		System.out.println(p1.sno);
		System.out.println(p1.sname);
		p1.m1();
	}
}
