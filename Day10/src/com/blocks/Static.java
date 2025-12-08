package com.blocks;

public class Static {
	
	static int a;
	
	static {
		a = 108;
		System.out.println("I am a Static Block");
	}
	
	static void m1() {
		System.out.println("I am a method");
	}
	
	public static void main(String[] args) {
		
		Static.m1();
		System.out.println(Static.a);
	}
}
