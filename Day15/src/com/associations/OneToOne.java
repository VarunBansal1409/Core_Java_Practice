package com.associations;

class Addr {
	int dno;
	String sname;

	Addr(int dno, String sname) {
		this.dno = dno;
		this.sname = sname;
	}
}

class Emp {
	int eno;
	String ename;
	Addr a1;

	Emp(int eno, String ename, Addr a1) {
		this.eno = eno;
		this.ename = ename;
		this.a1 = a1;
	}

	void diaplay() {
		System.out.println(eno);
		System.out.println(ename);
		System.out.println(a1.dno);
		System.out.println(a1.sname);
	}

}

public class OneToOne {

	public static void main(String[] args) {
		Addr a1 = new Addr(101, "hi-tec city");
		Emp e1 = new Emp(1, "ramu", a1);
		e1.diaplay();
	}

}
