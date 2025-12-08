package com.inheritance;

//single level inheritance

class Project {
	String project_name = "management project";
	int project_no = 1234;
}

class Manager extends Project {
	String manager_name = "ramu";
}

public class Single_Level1 {
	
	public static void main(String[] args) {

		// create object for project class
		Project p1 = new Project();
		System.out.println(p1.project_name);
		System.out.println(p1.project_no);

		System.out.println("=============");
		// create a object for manager class (accessing the properties of super class)
		Manager m1 = new Manager();
		System.out.println(m1.manager_name);
		System.out.println(m1.project_name);
		System.out.println(m1.project_no);

	}
}
