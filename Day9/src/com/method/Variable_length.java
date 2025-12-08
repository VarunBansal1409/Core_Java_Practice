package com.method;

import java.util.Arrays;

public class Variable_length {
	
	void m1(int a , int...b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(Arrays.toString(b));
	}
	
//	void m2(int...a , int b) {
//		System.out.println(a);
//	}
	
//	void m2(int a, int...b, int...c) {
//		System.out.println(b);
//	}
	
	public static void main(String[] args) {
			
		Variable_length v = new Variable_length();
		
		v.m1(10,20,30,40,50);
//		v.m2(10, 20 , 30);
	}
}
