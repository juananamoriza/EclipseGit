
public class CalculadoraVer {	
	private int num1;
	private int num2;

	public CalculadoraVer(int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	public int suma() { 
		int resul = num1 + num2;
		return resul;
	}
}