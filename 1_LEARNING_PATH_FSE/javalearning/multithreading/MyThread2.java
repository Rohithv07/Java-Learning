package com.rohith.javalearning.multithreading;

public class MyThread2 extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Lazy thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}

}
