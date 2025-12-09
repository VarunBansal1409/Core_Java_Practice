package com.access_modifers;

//private access modifier within same class and same package

public class Private {
	
	private int no = 101;
	private String name = "Dinesh";
	
	private void m1() {
		System.out.println("i am an instance method using private access modifier");
	}
	
	public static void main(String[] args) {
		
		Private p3 = new Private();
		System.out.println(p3.no);
		System.out.println(p3.name);
		p3.m1();
		
	}

}
