package com.associations;

class Student1 {
	int sno;
	String sname;

	Student1(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}
}

class Course {
	String cname;
	Student1[] stu;

	Course(String cname, Student1[] stu) {
		this.cname = cname;
		this.stu = stu;
	}

	void display() {
		System.out.println(cname);
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].sno);
			System.out.println(stu[i].sname);
		}
	}

}

public class ManyToMany {
	public static void main(String[] args) {

		Student1 s1 = new Student1(101, "ramu");
		Student1 s2 = new Student1(102, "anil");

		Student1[] stu = new Student1[2];
		stu[0] = s1;
		stu[1] = s2;

		Course c1 = new Course("java full stack", stu);
		c1.display();
		Course c2 = new Course("mern full stack", stu);
		c2.display();

	}
}
