package com.rohith.javalearning.exceptionHandlingDemo;

public class AssertDemo {

	public static void main(String[] args) {
		int withdrawnAmount = 100;
		int currentBalance = 60;
		// assert (withdrawnAmount < currentBalance); // will see an assertion
		// error
		assert (withdrawnAmount < currentBalance) : "amount is larger";
		// here the error will be stating amount is larger
	}

}
