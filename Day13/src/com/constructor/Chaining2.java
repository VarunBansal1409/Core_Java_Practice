package com.constructor;

class Chaining2_1{
	
	Chaining2_1(){
		System.out.println("i am deafult constructor of the super class / parent class");
	}
	
	Chaining2_1(int a){
		this();
		System.out.println("i am parameterized constructor of the super class / parent class");
	}
}

class Chaining2_2 extends Chaining2_1{
	
	Chaining2_2(int a){
		super(108);
		System.out.println("i am parameterized constructor of the sub class / child class");
	}
	
	Chaining2_2(){
		this(108);
		System.out.println("i am deafult constructor of the sub class / child class");
	}
}

public class Chaining2 {

	public static void main(String[] args) {
		
		Chaining2_2 c2_2 = new Chaining2_2();
		
	}
	
}
