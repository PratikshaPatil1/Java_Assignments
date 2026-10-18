package com.java_bykiran;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int val= scanner.nextInt();
		
		System.out.println("Value >> " + val);
		
		scanner.close();
		
	}

}
