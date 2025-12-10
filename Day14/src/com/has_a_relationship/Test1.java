package com.has_a_relationship;

class Addr {
	int dno = 101;
	String sname = "hit-tec city";
}

class Emp {
	int eno = 100;
	String ename = "ramu";

	Addr d1 = new Addr();

	void display() {
		System.out.println(eno);
		System.out.println(ename);
		System.out.println(d1.dno);
		System.out.println(d1.sname);
	}

}

public class Test1 {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.display();
	}

}
