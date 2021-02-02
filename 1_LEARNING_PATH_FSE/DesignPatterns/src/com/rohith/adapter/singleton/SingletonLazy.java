package com.rohith.adapter.singleton;

/*
 * This lazy approach will create an object only when there is an request for this particular class.
 */
public class SingletonLazy {
	private static SingletonLazy sc = null;

	private SingletonLazy() {
		// default constructor stub
	}

	public static SingletonLazy getInstance() {
		if (sc == null)
			sc = new SingletonLazy();
		return sc;
	}
}

/*
 * The disadvantage of this code is that it will fail in multi-threaded
 * environment. The problem is if there are two threads t1 and t2. t1 calls the
 * getInstance() method and sees the sc as null but it gets interrupted. SO t2
 * will call the getInstance() and see sc as null and create an object say o2.
 * t1 gets restarted and creates another object o1. SO two objects are created
 * for the same class.
 * 
 */
