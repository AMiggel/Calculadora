package unitaria;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculadora.SecondaryOperations;

public class CalculatorSecondaryTest {
	private SecondaryOperations operation;

	private static final double numero_1 = 9;
	private static final double indice = 3;

	@Before
	public void setUp() throws Exception {
		operation = new SecondaryOperations();
	}

	@Test
	public void raiz() {
		// act
		double result = operation.raiz(numero_1);

		// assert
		assertEquals(3.0, result, 0.1);
	}
	
	@Test
	public void raizN() {
		// act
		double number = operation.raizN(numero_1,indice);
		double result = Math.round(number * 100d) / 100d;
		// assert
		assertEquals(2.08, result, 0.1);
	}

}
