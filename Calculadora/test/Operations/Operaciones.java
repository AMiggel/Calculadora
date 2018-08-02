package Operations;

import static org.junit.Assert.*;

import org.junit.Test;

import calculadora.Operations;

public class Operaciones {

	@Test
	public void sumaTest() {
		 Operations operacion = new Operations();

        //arrange
		 double numero_1 = 7;
	     double numero_2 = 2;
         double numSuma = operacion.suma(numero_1, numero_2);
         double numResta = operacion.resta(numero_1, numero_2);
        
        //act
        double resultado = operacion.suma(numSuma, numResta);
        
        //assert
        assertEquals(14.0,resultado,0.1);
	}
	
	@Test
	public void restaTest() {
		 Operations operacion = new Operations();

        //arrange
		 double numero_1 = 7;
	     double numero_2 = 2;
         double numSuma = operacion.suma(numero_1, numero_2);
         double numResta = operacion.resta(numero_1, numero_2);
        
        //act
        double resultado = operacion.resta(numSuma, numResta);
        
        //assert
        assertEquals(4.0,resultado,0.1);
	}

}
