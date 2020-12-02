package com.rohith.javalearning.exceptionHandlingDemo;

public class Test {

	public static void main(String[] args) throws CheckedCustomException {
		//throw new UncheckedCustomException("There is an exception");
		throw new CheckedCustomException("another exception");
	}

}
