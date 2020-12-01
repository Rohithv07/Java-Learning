package com.rohith.javalearning.iostreamsdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class TryResourceBlockDemo {
	public static void main(String[] args) {
		int count = 0;
		// here declaring inside the try block help us to not giving try block
		// while closing the file
		// the jvm will automatically closed the file
		try (FileReader fr = new FileReader("/home/vazha/Downloads/Errichto-0000000000415b8c.txt");
				BufferedReader br = new BufferedReader(fr);) {
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
		}

	}

}
