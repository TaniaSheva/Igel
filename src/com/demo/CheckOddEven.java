package com.demo;

public class CheckOddEven  {

	public static void main(String[] args) {
		isNumberOdd(-18);

	}
	public static void isNumberOdd(int a) {
		double b = a%2;
	
		if (b == 0) {
			System.out.println( a + " is an Even number");
		}
		else if (b > 0 || b < 0) {
			System.out.println(a + " is an Odd number");
		}
		
		
	}
}
