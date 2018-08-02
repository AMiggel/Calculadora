package Operations;

import static org.junit.Assert.*;

import org.junit.Test;

import calculadora.Operations;

public class OperacionsRestaTest {

	@Test
	public void ingresoSieteYDosRecibocCinco() {

        //arrange
        double numero_1 = 7;
        double numero_2 = 2;
        
        //act
        Operations operacion = new Operations();
        double resultado = operacion.resta(numero_1, numero_2);
        
        //assert
        assertEquals(5.0,resultado,0.1);
	}

}
