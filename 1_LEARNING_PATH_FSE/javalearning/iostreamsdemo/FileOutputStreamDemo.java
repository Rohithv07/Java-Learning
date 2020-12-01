package com.rohith.javalearning.iostreamsdemo;

import java.io.*;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/home/vazha/Downloads/demo-image.png");
			fos = new FileOutputStream("/home/vazha/Downloads/new.png");
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
			System.out.println("FIle successfully copied");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
			}
			System.out.println("File close");
		}

	}

}
