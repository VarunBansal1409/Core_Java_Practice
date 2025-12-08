package com.inheritance;

//single level inheritance

class Father {
	String name = "ramu";
	String address = "hitec city";
	int phon = 12345;
}

class Son extends Father {
	double sal = 1000.00;
}

public class Single_Level {
	
	public static void main(String[] args) {
		
		// object for Father class
		Father f1 = new Father();
		System.out.println(f1.name);
		System.out.println(f1.address);
		System.out.println(f1.phon);

		System.out.println("===========");
		// object for son class (son class can access the property of father class)
		Son s1 = new Son();
		System.out.println(s1.name);
		System.out.println(s1.address);
		System.out.println(s1.phon);
		System.out.println(s1.sal);

	}
}
