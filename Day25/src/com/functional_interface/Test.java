package com.functional_interface;

@FunctionalInterface
interface A
{
	public abstract void m1();
//	public abstract void m2();  // error: Unexpected @FunctionalInterface annotation
}

public class Test {

	public static void main(String[] args) {
		
		A a = () -> System.out.println("I am Abstract Method"); // no need to specify return type
		                                 // no need to use return keyword if only one statement is there
		a.m1();
		
	}
	
}
