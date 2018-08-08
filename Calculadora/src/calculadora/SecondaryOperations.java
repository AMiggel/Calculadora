package calculadora;

public class SecondaryOperations {

	public double raiz(double numero_1) {
		return Math.sqrt(numero_1);
	}

	public double raizN(double numero_1, double indice) {
		return Math.pow(numero_1, 1 / indice);
	}

	public double Log(double numero_1) {
		return Math.log(numero_1);
	}

	public double tan(double num) {
		return Math.tan(num);
	}

	public double seno(double numero) {
		return Math.sin(numero);
	}
}
