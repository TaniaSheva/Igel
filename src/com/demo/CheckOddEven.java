package com.demo;

public class CheckOddEven  {

	public static void main(String[] args) {
		isNumberOdd(6);

	}
	public static void isNumberOdd(int a) {
		double b = a%2;
	
		if (b == 0) {
			System.out.println("Even number");
		}
		else if (b > 0) {
			System.out.println("Odd number");
		}
		
		
	}
}
