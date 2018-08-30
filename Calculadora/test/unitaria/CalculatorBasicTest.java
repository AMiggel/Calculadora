package unitaria;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculadora.Operations;

public class CalculatorBasicTest {

	private Operations operacion;

	private static final double numero_1 = 7;
	private static final double numero_2 = 2;
	
	//setUp
	@Before
	public void setUp() throws Exception {
	 //Operaciones
		operacion = new Operations();
	}

	@Test
	public void sumTest() {
		// act
		double result = operacion.suma(numero_1, numero_2);

		// assert
		assertEquals(9.0, result, 0.1);
	}

	@Test
	public void subtractTest() {
		// act
		double result = operacion.resta(numero_1, numero_2);

		// assert
		assertEquals(5.0, result, 0.1);
	}

	@Test
	public void divisionTest() {
		// act
		double result = operacion.dividir(numero_1, numero_2);

		// assert
		assertEquals(3.5, result, 0.1);
	}

	@Test
	public void multiplicacionTest() {
		// act
		double result = operacion.Multiplicar(numero_1, numero_2);

		// assert
		assertEquals(14, result, 0.1);
	}

}
