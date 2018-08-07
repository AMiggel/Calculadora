package calculadora;

public class SecondaryOperations {
	
	public double raiz(double numero_1) {
		return Math.sqrt(numero_1);
	}
	
	public double raizN(double numero_1,double indice) {
		return Math.pow(numero_1, 1/indice);
	}
}
