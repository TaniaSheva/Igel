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
			calculator.sum(a,b);
				break;
		case "sub":
			calculator.sub(a,b);
				break;
		case "div":
			calculator.div(a,b);
				break;
		case "mult":
            calculator.mult(a,b);
				break;
		default: 
			System.out.println("Please check inserted data!");

		}
	}
}

