package com.functional_interface;

@FunctionalInterface
interface A2
{
	public abstract String m1();
}

public class Test2 {

	public static void main(String[] args) {
		
		A2 a2 = () -> "Hello World"; // no need to specify return type
		                                 // no need to use return keyword if only one statement is there
		System.out.println(a2.m1());
		
	}
	
}
