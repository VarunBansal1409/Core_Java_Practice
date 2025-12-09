package com.constructor;

public class Copying {

	int eno;
	String ename;

	Copying() {
		eno = 101;
		ename = "Mudit";
	}

	Copying(Copying res) {

		eno = res.eno;
		ename = res.ename;
		System.out.println(ename + " : " + eno);

	}

	public static void main(String[] args) {

		Copying c1 = new Copying();
		Copying c2 = new Copying(c1);
	}

}
