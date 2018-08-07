package integracion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculadora.Operations;

public class CalculatorBasicTest {
	
	Operations operacion;

	private static final double numero_1 = 7;
	private static final double numero_2 = 2;
	
	@Before
	public void setUp() throws Exception {
		operacion = new Operations();
	}
	
	@Test
	public void sumaTest() {
        //arrange
         double numSuma = operacion.suma(numero_1, numero_2);
         double numResta = operacion.resta(numero_1, numero_2);
        
        //act
        double resultado = operacion.suma(numSuma, numResta);
        
        //assert
        assertEquals(14.0,resultado,0.1);
	}
	
	@Test
	public void restaTest() {
        //arrange
         double numSuma = operacion.suma(numero_1, numero_2);
         double numResta = operacion.resta(numero_1, numero_2);
        
        //act
        double resultado = operacion.resta(numSuma, numResta);
        
        //assert
        assertEquals(4.0,resultado,0.1);
	}
	
	@Test
	public void divisionTest() {
        //arrange
         double numSuma = operacion.suma(numero_1, numero_2);
         double numResta = operacion.resta(numero_1, numero_2);
        
        //act
        double resultado = operacion.dividir(numSuma, numResta);
        
        //assert
        assertEquals(1.8,resultado,0.1);
	}


	@Test
	public void multiplicacionTest() {
     
	}
}
