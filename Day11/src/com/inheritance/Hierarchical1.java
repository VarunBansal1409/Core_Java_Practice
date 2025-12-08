package com.inheritance;

//hierarchical inheritance

class Course {
	String cname = "java full stack";
}

class Student1 extends Course {
	String name = "ramu";
	int sno = 101;
}

class Student2 extends Course {
	String name = "abhi";
	int sno = 102;
}

public class Hierarchical1 {

	public static void main(String[] args) {

		// create object for course class
		Course c1 = new Course();
		System.out.println(c1.cname);

		System.out.println("=======");
		// create a object for student1 class
		Student1 s1 = new Student1();
		System.out.println(s1.name);
		System.out.println(s1.sno);
		System.out.println(s1.cname);

		System.out.println("==========");
		// create a object for student2 class
		Student2 s2 = new Student2();
		System.out.println(s2.name);
		System.out.println(s2.sno);
		System.out.println(s2.cname);
	}
}
