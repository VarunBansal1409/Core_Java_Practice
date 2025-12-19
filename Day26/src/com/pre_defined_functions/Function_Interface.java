package com.pre_defined_functions;

import java.util.function.Function;

public class Function_Interface {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> res = a -> a*a;
		System.out.println(res.apply(2)); //4
		
		Function<Integer, String> res1 = a1 -> "value of: "+a1;
		System.out.println(res1.apply(10));
		
	}

}
