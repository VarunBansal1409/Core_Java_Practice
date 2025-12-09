package com.test;

//protected access modifier in different class and different package

// use extends keyword
// parent class should be public
// import the public class	

import com.access_modifers.Protected;

public class Test_Protected1 extends Protected{
	
	public static void main(String[] args) {
		
		Test_Protected1 p3 = new Test_Protected1();
		System.out.println(p3.pno);
		System.out.println(p3.pname);
		p3.m1();
		
	}

}
