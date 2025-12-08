package com.inheritance;

//multi level inheritance 

class GrandFather {
	String name = "ramu";
}

class Father1 extends GrandFather {
	String Lname = "kumar";
}

class Son1 extends Father1 {
	int sal = 1000;
}

public class Multi_Level {
	
	public static void main(String[] args) {
		// create a object for grandfather class
		GrandFather g1 = new GrandFather();
		System.out.println(g1.name);

		System.out.println("===========");
		// object for father class
		Father1 f1 = new Father1();
		System.out.println(f1.name);
		System.out.println(f1.Lname);

		System.out.println("========");
		// create a object for son1 class
		Son1 s1 = new Son1();
		System.out.println(s1.name);
		System.out.println(s1.Lname);
		System.out.println(s1.sal);

	}
}
