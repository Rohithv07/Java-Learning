package com.rohith.javalearning.multithreading;

public class CheckProcessor implements Runnable {

	@Override
	public void run() {
		System.out.println("Process the checks");
	}

	public static void main(String[] args) {
		CheckProcessor cp = new CheckProcessor();
		Thread t = new Thread(cp);
		t.start();
	}

}
