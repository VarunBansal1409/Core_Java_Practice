package com.constructor;

public class Overloading {
	
	Overloading(String pname){
		System.out.println(pname);
	}
	
	Overloading(int pcost){
		System.out.println("$" + pcost);
	}
	
	Overloading(String pname , int pcost){
		System.out.println(pname + " : $" + pcost);
	}
	
	public static void main(String[] args) {
		
		Overloading o1 = new Overloading(635);
		Overloading o2 = new Overloading("Laptop" , 69999);
		Overloading o3 = new Overloading("Keyboard");
		
	}
	
}
