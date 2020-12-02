package com.rohith.javalearning.encapsulation;

public class Test {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setFirstName("Rohith");
		c.setLastName("V");
		c.setCreditCard("123");
		System.out.println(c.getFirstName() + " " + c.getLastName() + " " + c.getCreditCard());

	}

}
