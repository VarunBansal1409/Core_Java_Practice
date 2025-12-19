package com.optional_class;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		String str = "ExcelR";
		System.out.println(str);
		System.out.println("Length: " + str.length()); // 6
		
		System.out.println("================");
		
		String str1 = null;
		System.out.println(str1);
//		System.out.println("Length: " + str1.length()); // NullPointerException
		
		System.out.println("================");
		
		// Convert String to Optional
		
		Optional<String> res = Optional.ofNullable(str);
		System.out.println(res);   	// Optional[ExcelR]
		System.out.println(res.get()); // ExcelR
		
		System.out.println("================");
		
		Optional<String> res1 = Optional.ofNullable(str1);
		System.out.println(res1);   	// Optional.empty
//		System.out.println(res1.get()); // NoSuchElementException: No value present
		System.out.println(res1.orElse("Data Not Found")); // Data Not Found
		
		System.out.println("================");
		
		if(res.isPresent()) {
			System.out.println("Value is Present: " + res.get());
		} else {
			System.out.println("Value is Not Present");
		}
		
		if(res1.isPresent()) {
			System.out.println("Value is Present: " + res1.get());
		} else {
			System.out.println("Value is Not Present");
		}
		
	}
	
}
