package HomeWork3;
import java.util.Scanner;

public class Demo {
	private static Scanner in;

	public static void main(String[] args) {
		
		System.out.print("Please type first number");
		System.out.println();
		in = new Scanner(System.in);
		double a = in.nextDouble();
		
		System.out.print("Please type second number");
		System.out.println();
		in = new Scanner(System.in);
		double b = in.nextDouble();
		
		System.out.print("Please type one of the actions: sum, sub, div, mult");
		System.out.println();
		in = new Scanner(System.in);
		String action = in.next();
		
		Calculator calculator = new Calculator();
		
		switch (action) {
		case "sum":
			double c = calculator.sum(a,b);
			System.out.println("The summ of " + a + " and " + b + " is " + c);
				break;
		case "sub":
			double d = calculator.sub(a,b);
			System.out.println("The sub of " + a + " and " + b + " is " + d);
				break;
		case "div":
			double e = calculator.div(a,b);
			System.out.println("The div of " + a + " and " + b + " is " + e);
				break;
		case "mult":
			double m = calculator.mult(a,b);
			System.out.println("The mult of " + a + " and " + b + " is " + m);
				break;
		default: 
			System.out.println("Please check inserted data!");

		}
	}
}

