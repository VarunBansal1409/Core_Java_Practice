package com.interfaces;

interface Dept {
	void dept();
}

interface Management extends Dept {
	void management();
}

interface College extends Management {
	void college();
}

class Student implements College {
	public void dept() {
		System.out.println("depearment method overriding");
	}

	public void management() {
		System.out.println("management method overriding");
	}

	public void college() {
		System.out.println("college method overriding");
	}
}

public class Main2 {

	public static void main(String[] args) {

		// up-casting
		Dept d1 = new Student();
		d1.dept();

		System.out.println("======");
		Management m1 = new Student();
		m1.dept();
		m1.management();

		System.out.println("=======");
		College c1 = new Student();
		c1.college();
		c1.management();
		c1.dept();

	}

}
