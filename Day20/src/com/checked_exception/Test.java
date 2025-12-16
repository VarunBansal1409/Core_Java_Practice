package com.checked_exception;

public class Test {

	public static void main(String[] args) {

//		Class.forName("Main");  //ClassNotFoundException
		
		try {
			Class.forName("Main");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found ");
		} finally {
			System.out.println("finally block executed");
		}

	}

}

// note: ClassNotFoundException is a checked exception in Java that occurs
//		when an application tries to load a class through its string name using methods like Class.forName(),
//		but the specified class cannot be found in the classpath.
//  		here is an example of how to handle ClassNotFoundException using a try-catch block.
//		finally block is optional. It is used to execute a block of code regardless of whether an exception is thrown or not.