package com.rohith.javalearning.synchronizationDemo.blocks;

public class SynchronizationDemo {

	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();
		MyThread t1 = new MyThread(dm, "avc");
		MyThread t2 = new MyThread(dm, "ass");
		t1.start();
		t2.start();
	}

}
