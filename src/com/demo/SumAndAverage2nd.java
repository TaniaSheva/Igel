package com.demo;

public class SumAndAverage2nd {

	public static void main(String[] args) {
		sum(100);
		
	}
	public static void sum(int n){ 
		int sum = 0;
		double average = 0;
        sum = n*(n+1)/2; 
        average = sum/(double)n;
        System.out.println(sum);
        System.out.printf("%.2f",average);
}
	
}
