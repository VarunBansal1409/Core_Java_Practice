package com.conditional_statements;

public class Main2 {
	public static void main(String[] args) {
		
		// user and password
		String user = "admin";
		String pass = "admin@123";
				
		if(user == "admin") {
			System.out.println("User is correct");
			
			if(pass == "admin@123") {
				System.out.println("Password is correct");
				System.out.println("Login Successfull");
			}else {
				System.out.println("Password is incorrect");
				System.out.println("Login Unsuccessfull");
			}
			
		}else {
			System.out.println("Login Unsuccessfull");
		}
		
		System.out.println("=====================");
		
		String gender = "female";
		int age = 19;
		
		if(gender == "male") {
			System.out.println("gender is male");
			if(age >= 18) {
				System.out.println("eligible for voting");
			}else {
				System.out.println("not eligible for voting");
			}
		}else {
			System.out.println("gender is female");
			if(age >= 18) {
				System.out.println("eligible for voting");
			}else {
				System.out.println("not eligible for voting");
			}
		}
		
		System.out.println("=========================");
		
		int count = 12;
		
		switch(count)
		{
		case 1: System.out.println("monday");
		break;
		case 2: System.out.println("tuesday");
		break;
		case 3: System.out.println("wednesday");
		break;
		default : System.out.println("invalid value");
		}
	}
}
