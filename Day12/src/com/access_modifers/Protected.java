package com.access_modifers;

// protected access modifier within the same class and same package

public class Protected {
	
	protected int pno = 101;
	protected String pname = "Vishal";
	
	protected void m1() {
		System.out.println("I am an instance method using protected access modifer");
	}
	
	public static void main(String[] args) {
		
		Protected p2 = new Protected();
		System.out.println(p2.pno);
		System.out.println(p2.pname);
		p2.m1();
	}

}
