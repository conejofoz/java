package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class RotinaVetorProdutos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		System.out.println("Digite a quantidade de produtos");
		int n = sc.nextInt();
		
		Produto[] produtoVetor = new Produto[n];
		double soma = 0.0;
		
		for(int i = 0; i < produtoVetor.length; i++) {
			sc.nextLine();
			System.out.println("Digite o nome do produto: ");
			String nome = sc.nextLine();
			System.out.println("Digite o pre�o do produto: ");
			double preco = sc.nextDouble();
			produtoVetor[i] = new Produto(nome, preco);
			soma += produtoVetor[i].getPreco();
		}
		
		double media = soma / produtoVetor.length;
		System.out.printf("A m�dia �: %.2f", media);
		
		sc.close();

	}

}
