package com.rohith.observer;

import java.util.List;

/*
 * Concrete class to implememt the subject interface and store the reference to the observers registered to it.
 */
public class CommentaryObject implements Subject, Commentary {
	
	private final List<Observer> observers;
	private String desc;
	private final String subjectDetails;
	
	public CommentaryObject(List<Observer> observers, String subjectDetails) {
		super();
		this.observers = observers;
		this.subjectDetails = subjectDetails;
	}

	@Override
	public void setDesc(String desc) {
		this.desc = desc;
		notifyObservers();
	}

	@Override
	public void subscribeObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unSubscribeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);
	}

	@Override
	public void notifyObservers() {
		System.out.println();
		for (Observer observer : observers) {
			observer.update(desc);
		}
	}

	@Override
	public String subjectDetails() {
		return subjectDetails;
	}

}
