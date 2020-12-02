package com.rohith.javalearning.exceptionHandlingDemo;

import java.io.*;

public class CheckedException {
	void fileRead() throws FileNotFoundException {
		// since we give the throws the exception, we can remove the try catch
		// block
		try {
			FileInputStream fis = new FileInputStream("");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} finally {
			System.out.println("Finally you are here..");
			// this will be executed always
		}
	}

	public static void main(String[] args) throws FileNotFoundException{
		// here also we can remove the try and catch block
		CheckedException ce = new CheckedException();
		try {
		ce.fileRead();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
