package com.examples;

import java.io.BufferedInputStream;
import java.io.IOException;

public class Practice2 {
	
	public static void main(String[] args) throws IOException {
		/*
		char ch = 255;
		System.out.println(ch);
		*/
		
		/*
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println(string);
		System.out.println((int) string.toCharArray()[0]);
		
		
		scanner.close();*/
		
		
		BufferedInputStream buf = new BufferedInputStream(System.in);
		/*int intData = buf.read();
	     System.out.println(intData);
		System.out.println((char) intData);*/
		
		byte by[] = new byte[10];
		int upData = buf.read(by);
		System.out.println(upData);
		for(int i = 0; i < by.length; i ++) {
			System.out.println(by[i] + " : " + (char) by[i]);
		}
		
		
		
	}

}
