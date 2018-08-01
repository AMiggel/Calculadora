package Operations;

import calculadora.Operations;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OperationsSumaTest {
    
    public OperationsSumaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void ingresoDosYSieteReciboNueve() {
    
        //arrange
        double numero_1 = 2;
        double numero_2 = 7;
        
        //act
        Operations operacion = new Operations();
        double resultado = operacion.suma(numero_1, numero_2);
        
        //assert
        assertEquals(9.0,resultado,0.1);
        
    }
}
