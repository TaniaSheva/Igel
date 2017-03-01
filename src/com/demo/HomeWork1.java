package com.demo;

public class HomeWork1 {

	public static void main(String[] args) {
		double a = 1;
		double b = 2;
		double c = 1;
		
		double d = b*b - 4*a*c;
		if (d<0) {
			System.out.println("No results");
		}
		else if (d==0) {
			double x = -(b/2*a);
			System.out.println(x);	
		}
		else {
		double x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
		double x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);

		System.out.println(x1);
		System.out.println(x2);
		}
	}

}
