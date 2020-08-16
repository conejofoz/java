package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class RotinaEstoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int compra;
		int venda;
		
		
		//Produto produto = new Produto();
		
		
		System.out.println("Digite o nome do produto:");
		String nome = sc.nextLine();
		
		System.out.println("Digite o preço do produto:");
		double preco = sc.nextDouble();
		
		System.out.println("Digite a quantidade do produto:");
		int quantidade = sc.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);
		
		System.out.println(produto);
		
		System.out.println("Digite a quantidade comprada:");
		compra = sc.nextInt();
		produto.adicionarProduto(compra);
		
		System.out.println(produto);
		
		System.out.println("Digite a quantidade vendida:");
		venda = sc.nextInt();
		produto.removerProduto(venda);
		
		System.out.println(produto);
		
		
		
		sc.close();
		

	}

}
