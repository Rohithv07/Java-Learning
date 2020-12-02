package com.rohith.javalearning.multithreading;

public class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("hai child thread");
			Thread.yield(); // yield for the main method to finish, then the child thread
		}
	}
}
