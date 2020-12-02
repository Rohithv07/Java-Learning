package com.rohith.javalearning.synchronizationDemo.classLock;

public class SynchronizationDemo {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("avc");
		MyThread t2 = new MyThread("ass");
		t1.start();
		t2.start();
	}

}

// synchronized block can be used for some parts of the method