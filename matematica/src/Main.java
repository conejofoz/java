
public class Main {

	public static void main(String[] args) {
		
		double delta;
		double a = 13;
		double b = 18;
		double c = 5;
		
		double x1;
		double x2;
		
		delta = Math.pow(b, 2.0) - 4 * a *c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("X1" + x1);
		System.out.println("X2" + x2);
		
		double n1 = 5;
		double n2 = 3;
		double n3 = -2.0;
		
		System.out.println("Raiz quadrada de " + n1 + " � " +Math.sqrt(n1));
		System.out.println("Pot�ncia de " + n2 + " elevado a 2 � " + Math.pow(n2, 2));
		System.out.println("O n�mero absoluto de " + n3 + " � " + Math.abs(n3));

	}

}
