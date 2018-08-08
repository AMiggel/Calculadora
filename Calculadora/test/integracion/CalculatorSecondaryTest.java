package integracion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculadora.Operations;
import calculadora.SecondaryOperations;

public class CalculatorSecondaryTest {
	private SecondaryOperations operation;

	private static final double numero_1 = 9;

	@Before
	public void setUp() throws Exception {
		operation = new SecondaryOperations();
	}

	@Test
	public void raizTest() {
		 //arrange
        double numSeno = operation.seno(numero_1);
        
		// act
		double numRaiz = operation.raiz(numSeno);
		double result = Math.round(numRaiz * 100d) / 100d;

		// assert
		assertEquals(0.64, result, 0.1);
	}

	@Test
	public void senoTest() {
		 //arrange
        double numRaiz = operation.raiz(numero_1);
        
		// act
		double numSeno = operation.seno(numRaiz);
		double result = Math.round(numSeno * 100d) / 100d;

		// assert
		assertEquals(0.14, result, 0.1);
	}
	
	@Test
	public void tanTest() {
		 //arrange
        double numRaiz = operation.raiz(numero_1);

        // act
		double numTan = operation.tan(numRaiz);
		double result = Math.round(numTan * 100d) / 100d;
		
		// assert
		assertEquals(-0.14, result, 0.1);
	}
	
	@Test
	public void logNTest() {
		 //arrange
        double numSeno = operation.seno(numero_1);

        // act
		double numLogN = operation.Log(numSeno);
		double result = Math.round(numLogN * 100d) / 100d;
		
		// assert
		assertEquals(-0.89, result, 0.1);
	}

}
