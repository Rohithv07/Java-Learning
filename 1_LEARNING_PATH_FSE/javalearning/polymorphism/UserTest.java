package com.rohith.javalearning.polymorphism;

public class UserTest {
	public void printUserType(User u) {
		u.printUserType();
	}

	public static void main(String[] args) {
		// part1
		User user = new User(); // reference type name = new ObjectType()
		User staff = new Staff();
		User editor = new Editor();

		UserTest ut = new UserTest();
		ut.printUserType(user);
		ut.printUserType(staff);
		ut.printUserType(editor);

		// part2
		editor.postAReview();
		editor.saveWebLink();
		// JVM is going to search for a particular method from the object type

	}
}
