package HomeWork3;

public class Calculator {
	public void div (double a,double b){
		double result = a/b;
		if (b !=0 ){
		System.out.println("The div of " + a + " and " + b + " is " + result);
		}
		else {
			System.out.println("Division by zero");
		}
			
	}
	public void mult (double a,double b){
		double result = a*b;
		System.out.println("The mult of " + a + " and " + b + " is " + result);
	}
	
	public void sum (double a,double b){
		double result = a+b;
		System.out.println("The sum of " + a + " and " + b + " is " + result);
	}
	
	public void sub (double a,double b){
		double result = a - b;
		System.out.println("The sub of " + a + " and " + b + " is " + result);
	}
}
