package com.rohith.observer;
/*
 * An interface with 3 key methods.
 */
public interface Subject {
	public void subscribeObserver(Observer observer); // to subscribe observers
	public void unSubscribeObserver(Observer observer); // to unsubscribe observers
	public void notifyObservers(); // to notify subscribed obsersvers
	public String subjectDetails(); 
}
