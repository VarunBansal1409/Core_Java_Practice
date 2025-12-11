package com.encapsulation;

class Emp {
	// private variables
	private int eno;
	private String ename;

	// create a setter() and getter()
	public String getEno() {
		if(eno > 0)
		{
			return "valid: "+eno;
		}else {
			return "inValid: "+eno;
		}
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
}

public class Main1 {

	public static void main(String[] args) {

		Emp e1 = new Emp();
		// set the value
		e1.setEno(100);
		e1.setEname("ramu");

		// get the value
		System.out.println(e1.getEno());
		System.out.println(e1.getEname());

	}

}
