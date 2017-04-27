package Quadratic_Equation;

import java.util.ArrayList;

public class HomeWork1 {

	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;
		
		ArrayList <Double> results = Equation_Solution_Finder.findSolutions(a,b,c);
		Equation_Solution_Finder.printSolutions(results);
		
		}
	}

