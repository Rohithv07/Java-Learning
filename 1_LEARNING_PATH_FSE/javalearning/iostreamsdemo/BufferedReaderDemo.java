package com.rohith.javalearning.iostreamsdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {
	// count the number of words and print each word
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		int count = 0;
		try {
			fr = new FileReader("/home/vazha/Downloads/Errichto-0000000000415b8c.txt");
			br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					count++;
				}
			}
			System.out.println("The count is :" + count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (Exception e) {
			}
		}

	}

}
