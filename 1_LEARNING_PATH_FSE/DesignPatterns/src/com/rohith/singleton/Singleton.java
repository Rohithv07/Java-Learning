package com.rohith.adapter.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*
 * This class shows a way how to protect your class from getting instantiated more than once.
 */
public class Singleton implements Serializable {
	private static final long serialVersionId = -109191919191L;
	private static Singleton sc = new Singleton();

	private Singleton() {
		if (sc != null) {
			throw new IllegalStateException("Already created");
		}
	}

	public static Singleton getInstance() {
		return sc;
	}

	private Object readResolve() throws ObjectStreamException {
		return sc;
	}

	private Object writeReplace() throws ObjectStreamException {
		return sc;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Singleton cannot be cloned");
	}

	private static Class getClass(String className) throws ClassNotFoundException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		if (classLoader == null) {
			classLoader = Singleton.class.getClassLoader();
		}
		return classLoader.loadClass(className);
	}

}
