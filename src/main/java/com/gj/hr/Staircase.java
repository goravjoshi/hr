package com.gj.hr;

import java.util.Scanner;

public class Staircase {

	private static void printStairCase(int n) {
		char[] toPrint = new char[n];
		initializeToEmtyChar(toPrint);
		
		char symbol = '#';
		for (int i = n-1; i >= 0; i--) {
			toPrint[i] = symbol;
			System.out.println(toPrint);
		}
	}

	private static void initializeToEmtyChar(char[] toPrint) {
		for (int i = 0; i < toPrint.length; i++) {
			toPrint[i] = ' ';
		}
	}

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int _a;
			_a = in.nextInt();
			printStairCase(_a);
		}
	}

}
