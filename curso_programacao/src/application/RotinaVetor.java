package application;

import java.util.Locale;
import java.util.Scanner;

public class RotinaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double soma = 0.0;
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		double media = soma / n;
		
		System.out.println("A m�dia � : " + media);
		
		
		
		
		sc.close();

	}

}
