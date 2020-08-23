package application;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Maria", "maria@gmail.com");
		Cliente c2 = new Cliente("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		//Vai dar verdadeiro por que o equals foi definido para comparar o nome e o email
		System.out.println(c1.equals(c2));
		
		//Vai dar falso por que apesar do CONTEÚDO ser igual os dois objetos ocupam referência de memória diferentes
		//isso usando o new para criar os objetos
		System.out.println(c1==c2);
		
		//o compilador da um tratamento especial para literais
		//nesse caso vai dar true porque são literais
		String s1 = "Teste";
		String s2 = "Teste";
		System.out.println(s1==s2);
		
		
	}

}
