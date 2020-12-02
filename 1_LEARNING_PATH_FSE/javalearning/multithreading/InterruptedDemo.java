package com.rohith.javalearning.multithreading;

public class InterruptedDemo {

	public static void main(String[] args) {
		MyThread2 mt2 = new MyThread2();
		mt2.start();
		mt2.interrupt();
		System.out.println("End of main");
	}

}
