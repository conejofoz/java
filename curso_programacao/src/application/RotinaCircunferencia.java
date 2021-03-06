package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class RotinaCircunferencia {

	// public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de radios: ");
		double radios = sc.nextDouble();

		double c = Calculator.circunference(radios); // m�todo est�tico n�o precisa instanciar
		double v = Calculator.volume(radios);

		System.out.printf("Circunfer�ncia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI : %.2f%n", Calculator.PI);

		sc.close();

	}

	/*
	 * public static double circunference(double radius) { return 2.0 * PI * radius;
	 * }
	 * 
	 * public static double volume(double radius) { return 4.0 * PI * radius *
	 * radius * radius / 3.0; }
	 */

}
