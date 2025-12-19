package com.pre_defined_functions;

import java.util.function.Consumer;

public class Consumer_Interface {
	
	public static void main(String[] args) {
		
		Consumer<Integer> res = a -> System.out.println(a);
		res.accept(10);
		
		Consumer<String> res1 = a1 -> System.out.println(a1);
		res1.accept("hello world");
	}

}
