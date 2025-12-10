 package com.tostring;

public class Demo1 {

	int sno;
	String sname;

	Demo1(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}

	public static void main(String[] args) {

		Demo1 s1 = new Demo1(101, "ramu");
		System.out.println(s1);

	}

}
