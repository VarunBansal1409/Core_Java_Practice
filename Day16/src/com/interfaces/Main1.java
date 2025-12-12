package com.interfaces;

interface Development {
	void developer();
}

interface Tester {
	void tester();
}

class Emp implements Development, Tester {
	@Override
	public void developer() {
		System.out.println("iam a developer");
	}

	@Override
	public void tester() {
		System.out.println("iam a tester");
	}
}

public class Main1 {

	public static void main(String[] args) {

		// up-casting
		Development d1 = new Emp();
		d1.developer();

		Tester t1 = new Emp();
		t1.tester();

	}

}
