package com.rohith.adapter.singleton;

/*
 * We will be having a private constructor so this class cannot be instantiated outside. And we will be using a static varible for this class.
 * We make use of a method getInstance() through which sc will get access.
 */
public class SingletonEager {
	private static SingletonEager sc = new SingletonEager();

	private SingletonEager() {
		// default constructor stub
	}

	public static SingletonEager getInstance() {
		return sc;
	}
}

/*
 * The problem with this method is as soon as this class is loaded an object
 * will be created eventhough its not used in the whole application. So we can
 * have SingletonLazy
 */
