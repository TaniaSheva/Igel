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
		
		assertEquals(-1.0, Equation_Solution_Finder.findSolutions(1,2,1),0);

	}
	
	
	@Test
	public void testDMoreThanZero() {
		Equation_Solution_Finder.findSolutions(1,4,1);

	}
}
