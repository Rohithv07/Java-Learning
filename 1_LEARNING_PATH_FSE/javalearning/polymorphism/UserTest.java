package com.rohith.javalearning.polymorphism;

public class UserTest {
	public void printUserType(User u) {
		u.printUserType();
	}

	public void approveReview(Staff s) {
		// s.approveReview(); // compiler knows approveReview is not in staff
		// solution is to caste
		if (s instanceof Editor) {
			((Editor) s).approveReview();
		} else
			System.out.println("Invalid object passed");
	}

	public static void main(String[] args) {
		// part1
		User user = new User(); // reference type name = new ObjectType()
		User staff = new Staff();
		User editor = new Editor();
		staff.postAReview("");
		((Staff) staff).printId();
		staff.staticMethod();
		staff.instanceMethod(10); // compiler will look at user and checks
									// whether it can find a compatible
									// parameter or a compatible method. Thus
									// user instance method is
									// returned
		staff.staticMethod(); // early binding, user gets invoked.
		// apply cast to invoke staff static method
		((Staff) staff).staticMethod(); // staff static method is invoked
		staff.saveWebLink();
		staff.displayUserInfo(); // id will be from the user and the type will
									// be staff as value is reassigned inside
									// the staff constructor
		UserTest ut = new UserTest();
		ut.printUserType(user);
		ut.printUserType(staff);
		ut.printUserType(editor);

		// part2
		// editor.postAReview();
		editor.saveWebLink();
		// JVM is going to search for a particular method from the object type
		ut.approveReview(new Staff());

	}
}

// static methods are not overridden
// fields are not overridden
// final methods are not overridden
