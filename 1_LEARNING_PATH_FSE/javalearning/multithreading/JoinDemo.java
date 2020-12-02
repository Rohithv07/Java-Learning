package com.rohith.javalearning.multithreading;

import java.util.Scanner;

public class JoinDemo extends Thread {
	static int n;
	static int sum = 0;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum of first of n numbers");
		System.out.println("Enter the n:");
		JoinDemo.n = sc.nextInt();
		JoinDemo jd = new JoinDemo();
		jd.start();
		try {
			jd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(JoinDemo.sum); // if we run this pgm without using
											// the jd.join(), then 0 will be
											// printed as the program doesn't
											// stops for the run() to finish
		long end = System.currentTimeMillis();
		System.out.println("Total time taken " + (end - start) / 1000 + "s");
	}

	public void run() {
		for (int i = 1; i <= JoinDemo.n; i++) {
			JoinDemo.sum += i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
