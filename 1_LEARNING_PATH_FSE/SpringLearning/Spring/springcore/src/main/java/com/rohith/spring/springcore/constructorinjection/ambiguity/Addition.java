package com.rohith.spring.springcore.constructorinjection.ambiguity;

public class Addition {
	
	
	Addition(double a, double b) {
		System.out.println("Inside constructor double");
	}
	
	Addition(int a, int b) {
		System.out.println("Inside constructor int");
	}
	
	Addition(String a, String b) {
		System.out.println("Inside constructor string");
	}
}
