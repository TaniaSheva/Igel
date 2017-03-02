package com.demo;

import java.util.Scanner;

public class CheckOddEven  {
	
	private static Scanner a;
	public static void main(String[] args) {
		
		System.out.print("Please type a number you want to check");
		System.out.println();
		a = new Scanner(System.in);
		int number = a.nextInt();
		isNumberOdd(number);

	}
	public static void isNumberOdd(int number) {
		double leftover = number%2;
	
		if (leftover == 0) {
			System.out.println(number + " is an Even number");
		}
		else  {
			System.out.println(number + " is an Odd number");
		}
		
		
	}
}
