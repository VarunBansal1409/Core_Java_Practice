package com.throw_keyword__user_defined_exception;

class DemoThread extends RuntimeException {
	DemoThread(String msg) {
		super(msg); // constructor chaining using throwable
	}
}

public class Test6 {

	void InsufficientBalance(int cost) {
		int amount = 1000;
		if (amount >= cost) {
			int res = amount - cost;
			System.out.println(res + " is the remaining amount");
		} else {
			throw new DemoThread("NotSufficentMoney");
		}
	}

	public static void main(String[] args) {
		Test6 t6 = new Test6();
		t6.InsufficientBalance(300);
	}

}

// note: Here, we define a custom unchecked exception DemoThread by extending RuntimeException.
	//	it is a user-defined exception that is thrown when the cost provided exceeds the available amount,
	//	indicating that there is not sufficient money.
	//  throw keyword is used to explicitly throw an exception.