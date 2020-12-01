package com.rohith.javalearning.iostreamsdemo;

import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File("/home/vazha/Downloads/Errichto-0000000000415b8c.txt"));
			System.out.println("File opened");
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("File closed");
		}
	}

}
