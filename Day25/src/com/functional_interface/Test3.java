package com.functional_interface;

@FunctionalInterface
interface A3
{
	public abstract int m1(int a, int b);
}

public class Test3 {

	public static void main(String[] args) {
		
		A3 a3 = (a, b) -> a + b; 	// no need to specify data types of a and b
									// no need to use return keyword if only one statement is there
									// no need of curly braces if only one statement is there
							
		System.out.println(a3.m1(10, 20));
	}
	
}
