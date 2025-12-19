package com.pre_defined_functions;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier_Interface {
	
	public static void main(String[] args) {
		
		Supplier<String> res = () -> "hello world";
		System.out.println(res.get());
		
		Supplier<Date> res1 =  () -> new Date();
		System.out.println(res1.get());
		
	}

}
