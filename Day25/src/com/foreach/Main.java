package com.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		System.out.println(numbers); // [10, 20, 30, 40, 50]
		
		// implement forEach()
		numbers.forEach(x -> System.out.println(x));
		
		System.out.println("=================");
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("Diana");
		names.add("Ethan");
		
		System.out.println(names);
		names.forEach(x -> System.out.println(x));
		
		System.out.println("==================");
		
		// convert array into a list
		
		Integer[] arr = {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(arr));
		
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);
		
		list.forEach(x -> System.out.println(x));
		
	}
	
}
