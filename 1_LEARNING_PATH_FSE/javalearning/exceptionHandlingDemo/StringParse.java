package com.rohith.javalearning.exceptionHandlingDemo;

public class StringParse {

	public static void main(String[] args) {
		String s = "abcd";
		try {
			int i = Integer.parseInt(s); // number format exception
		} catch (NumberFormatException e) {
			System.out.println("Provide the correct parsing");
		}
	}

}
