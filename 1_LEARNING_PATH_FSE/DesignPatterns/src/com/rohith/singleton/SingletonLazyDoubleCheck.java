package com.rohith.adapter.singleton;

/*
 * Here we first check whether an instance is created or not, then we synchronize. So we only synchronize the first time.
 */
public class SingletonLazyDoubleCheck {
	private volatile static SingletonLazyDoubleCheck sc = null;

	private SingletonLazyDoubleCheck() {
		// default constructor stub
	}

	public static SingletonLazyDoubleCheck getInstance() {
		if (sc == null) {
			synchronized (SingletonLazyDoubleCheck.class) {
				if (sc == null) {
					sc = new SingletonLazyDoubleCheck();
				}
			}
		}
		return sc;
	}
}

/*
 * Some other ways to break the singleton pattern -> if the class is
 * serializable. 
 * -> if its clonable. 
 * -> it can be break by reflection. 
 * -> if the class is loaded by multiple class loaders.
 */