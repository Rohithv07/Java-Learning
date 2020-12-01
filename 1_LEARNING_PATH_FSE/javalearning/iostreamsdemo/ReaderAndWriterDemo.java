package com.rohith.javalearning.iostreamsdemo;

import java.io.*;

public class ReaderAndWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("/home/vazha/Downloads/Errichto-0000000000415b8c.txt");
			fw = new FileWriter("/home/vazha/Downloads/Errichto.txt");
			int ch;
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
			}
			System.out.println("File are sucessfully copied");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (Exception e) {
			}
			;
			System.out.println("Files are closed");
		}
	}
}
