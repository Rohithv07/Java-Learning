package com.rohith.observer;

import java.util.ArrayList;

public class TestObserver {
	public static void main(String[] args) {
		Subject subject = new CommentaryObject(new ArrayList<Observer>(), "Soccer match (2012Aug)");
		Observer observer = new SMSUsers(subject, "Name of a guy");
		observer.subscribe();
		System.out.println();
		Observer observer2 = new SMSUsers(subject, "Name of a guy");
		observer2.subscribe();
		CommentaryObject cObject = (CommentaryObject) subject;
		cObject.setDesc("Welcome to the show");
		cObject.setDesc("Goaaaaaaallllll");
		System.out.println();
		observer2.unSubscribe();
		System.out.println();
		cObject.setDesc("Goaaaaaaallllll Spectacular");
		cObject.setDesc("That hurts");
		System.out.println();
	}
}
