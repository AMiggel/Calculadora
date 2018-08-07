package unitaria;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculadora.Operations;

public class CalculatorBasicTest {

	private Operations operacion;

	private static final double numero_1 = 7;
	private static final double numero_2 = 2;

	@Before
	public void setUp() throws Exception {
		operacion = new Operations();
	}

	@Test
	public void sumTest() {
		// act
		double resultado = operacion.suma(numero_1, numero_2);

		// assert
		 assertEquals(9.0,resultado,0.1);
	}
	
	@Test
	public void subtractTest() {
		// act
		double resultado = operacion.resta(numero_1, numero_2);

		// assert
		assertEquals(5.0, resultado, 0.1);
	}
	
	@Test
	public void divisionTest() {
		// act
		double resultado = operacion.dividir(numero_1, numero_2);

		// assert
		assertEquals(3.5, resultado, 0.1);
	}
	
	@Test
	public void multiplicacionTest() {
		
	}


}
