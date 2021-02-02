package com.rohith.adapter.singleton;

/*
 * So here we uses the keyword synchronized which makes other threads waits until a particular thread finished the operation and thus stop 
 * the creation of multiple object.
 */
public class SingletonLazyMultiThread {
	private static SingletonLazyMultiThread sc = null;

	private SingletonLazyMultiThread() {
		// default constructor stub
	}

	public static synchronized SingletonLazyMultiThread getInsance() {
		if (sc == null)
			sc = new SingletonLazyMultiThread();
		return sc;
	}
}

/*
 * If we dont want to use synchronization there is a method known as double
 * checked locking.
 */
