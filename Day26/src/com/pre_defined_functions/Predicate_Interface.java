package com.pre_defined_functions;

import java.util.function.Predicate;

public class Predicate_Interface {
	public static void main(String[] args) {
		
		Predicate<Integer> res = a -> a > 5;
		System.out.println(res.test(10)); //true
		System.out.println(res.test(2)); //false
		
		Predicate<Integer> res1 = a1 -> a1 % 2 == 0;
		System.out.println(res1.test(10)); //true
		System.out.println(res1.test(3)); //false
		
		Predicate<Integer> both = res.and(res1);
		System.out.println(both.test(10)); //true
		System.out.println(both.test(7)); //false
		
	}
}
