package Quadratic_Equation;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

public class quadraticEquationTest {
	


	@Test
	public void testDIsLessThanZero() {
		Equation_Solution_Finder.findSolutions(2,2,1);

	}
	@Test
	public void testDEqualsZero() {
		Equation_Solution_Finder method = new Equation_Solution_Finder
		assertEquals(-1,Equation_Solution_Finder.findSolutions(1,2,1));

	}
	
	
	@Test
	public void testDMoreThanZero() {
		Equation_Solution_Finder.findSolutions(1,4,1);

	}
}
