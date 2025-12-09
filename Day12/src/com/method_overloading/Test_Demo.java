package com.method_overloading;

// use in multiple calls

public class Test_Demo {

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		d1.product(89999);
		d1.product("Asus Laptop");
		d1.product(299, "T-shirt");
	}
	
}
