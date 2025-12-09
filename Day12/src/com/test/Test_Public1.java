package com.test;

// public access modifier in different class and different package

// first import the Public class

import com.access_modifers.Public;

public class Test_Public1 {
	
	public static void main(String[] args) {
		
		Public p1 = new Public();
		System.out.println(p1.sno);
		System.out.println(p1.sname);
		p1.m1();
		
	}
	
}
