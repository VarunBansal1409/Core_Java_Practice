package com.method_overloading;

public class Demo {

	void product(String pname) {
		System.out.println(pname);
	}
	
	void product(int pprice) {
		System.out.println(pprice);
	}
	
	void product(int pprice, String pname) {
		System.out.println(pname +" : " + pprice);
	}
	
}
