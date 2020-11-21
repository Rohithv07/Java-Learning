package com.rohith.javalearning.polymorphism;

// super class
public class User {
	public void printUserType() {
		System.out.println("User");
	}

	public void saveWebLink() {
		System.out.println("User web link");
		postAReview();
	}

	public void postAReview() {
		System.out.println("User: postAReview");
	}
}
