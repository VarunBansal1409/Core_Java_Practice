package com.associations;

class Dept {
	String dname;

	Dept(String dname) {
		this.dname = dname;
	}
}

class Student {
	int sno;
	String sname;
	Dept d1;

	Student(int sno, String sname, Dept d1) {
		this.sno = sno;
		this.sname = sname;
		this.d1 = d1;
	}

	void display() {
		System.out.println(sno);
		System.out.println(sname);
		System.out.println(d1.dname);
	}
}

public class ManyToOne {

	public static void main(String[] args) {
		Dept d1 = new Dept("CSE");
		Student s1 = new Student(101, "ramu", d1);
		s1.display();
		Student s2 = new Student(102, "anil", d1);
		s2.display();

	}
}
