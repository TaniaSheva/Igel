package com.demo;

public class HarmonicSum {

	public static void main(String[] args) {
		double sum = 0;
		int i = 1;
		while (i <= 5) {
			sum += 1/(double)i;
			i++;
		}
		System.out.printf("Sum is = " + "%.20f", sum);

	}

}
