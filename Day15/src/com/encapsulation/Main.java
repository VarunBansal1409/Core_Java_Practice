package com.encapsulation;

class Student {
	// create private variables
	private int sno;
	private String sname;

	// create a setter() and getter() public

	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void getSno() {
		System.out.println(sno);
	}

	public void getSname() {
		System.out.println(sname);
	}

}

public class Main {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		//set the value
		s1.setSno(101);
		s1.setSname("ramu");
		
		//get the value
		s1.getSno();
		s1.getSname();
	}

}
