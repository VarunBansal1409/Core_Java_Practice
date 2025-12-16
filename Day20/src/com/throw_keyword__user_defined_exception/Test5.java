package com.throw_keyword__user_defined_exception;

class SampleThread extends RuntimeException {
	SampleThread(String msg) // constructor
	{
		super(msg); // constructor chaining use throwable
	}
}

public class Test5 {

	void InvalidAgeException(int age) {
		if (age >= 18) {
			System.out.println("eligible for voiting");
		} else {
			throw new SampleThread("NotEligibleForVoting");
		}

	}

	public static void main(String[] args) {

		Test5 t5 = new Test5();
		t5.InvalidAgeException(10);

	}

}

// note: Here, we define a custom unchecked exception SampleThread by extending RuntimeException.
//	it is a user-defined exception that is thrown when the age provided is less than 18,
//	indicating that the person is not eligible for voting.
//  throw keyword is used to explicitly throw an exception.
	