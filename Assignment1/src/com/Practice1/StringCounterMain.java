package com.Practice1;

import java.util.Scanner;

public class StringCounterMain {
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String userString = sc.nextLine();
		
		CharInStringCounter charInStringCounter = new CharInStringCounter();
		charInStringCounter.counter(userString);
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total Execution Time: " + (endTime - startTime) + "ms");
	}
	
}
