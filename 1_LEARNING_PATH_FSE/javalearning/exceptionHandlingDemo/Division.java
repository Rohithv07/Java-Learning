package com.rohith.javalearning.exceptionHandlingDemo;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		System.out.println("Enter 2 integers");
		Scanner sc = new Scanner(System.in);
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		}
		System.out.println("Program finishes");
		sc.close();
	}

}
