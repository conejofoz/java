package condicoes;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {

		double valor;
		double desconto=0.0;
		double resultado = 0.0;
		System.out.println("Informe o preço do produto:");
		Scanner scanner = new Scanner(System.in);
		valor = scanner.nextDouble();
		
		desconto = (valor < 20) ? valor * 0.1 : valor * 0.5;
		resultado = valor - desconto;
		
		System.out.println("o valor do produto com desconto é: " + resultado);

	}

}
