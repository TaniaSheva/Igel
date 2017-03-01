package com.demo;

public class SumAndAverage {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		double average = 0;
		
		while (i <= 100) {
			sum = sum + i;
			i++;
		}
		average = sum/100.0;
		System.out.println("Sum is = " + sum);
		System.out.println("Average is = " + average);
	}

}
