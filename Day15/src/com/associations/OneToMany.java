package com.associations;

class Emps {
	int eno;
	String ename;

	Emps(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}
}

class Company {
	String cname;
	Emps[] emp;

	Company(String cname, Emps[] emp) {
		this.cname = cname;
		this.emp = emp;
	}

	void display() {
		System.out.println(cname);
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].eno);
			System.out.println(emp[i].ename);
		}
	}
}

public class OneToMany {

	public static void main(String[] args) {
		Emps e1 = new Emps(101, "abc");
		Emps e2 = new Emps(102, "mno");

		Emps[] emp = new Emps[2];
		emp[0] = e1;
		emp[1] = e2;

		Company c1 = new Company("excelr", emp);
		c1.display();

	}

}
