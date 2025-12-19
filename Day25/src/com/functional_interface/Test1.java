package com.functional_interface;

@FunctionalInterface
interface A1
{
	public abstract void m1(int a, int b);
}

public class Test1 {

	public static void main(String[] args) {
		
		A1 a1 = (a, b) -> { 		 	// no need to specify data types of a and b
										// use of curly braces if more than one statement is there
			System.out.println(a);
			System.out.println(b);
			System.out.println(a +b);
		};
		
		a1.m1(21, 98);
		System.out.println("===================");
		a1.m1(21, 74);
		
	}
	
}
