package com.rohith.javalearning.polymorphism;

// super class
public class User {
	public int id = 1;
	public String userType = "User";
	
	public void displayUserInfo() {
		System.out.println("Printing user info: ");
		System.out.println("id: "+id);
		System.out.println("Usertytpe: " + userType);
	}

	public void printUserType() {
		System.out.println("User");
	}

	public void saveWebLink() {
		System.out.println("User web link");
		// postAReview();
		staticMethod();
	}

	public Reviw postAReview(String reviewText) {
		System.out.println("User: postAReview");
		Reviw review = new Reviw(reviewText);
		return review;
	}

	// method binding demo
	public static void staticMethod() {
		System.out.println("User: static method");
	}

	public void instanceMethod(double d) {
		System.out.println("User: InstanceMethod");
	}

	public void instanceMethod(User u) {
		System.out.println("User: InstanceMethod");
	}

	public final void finalMethod() {
	}
}
