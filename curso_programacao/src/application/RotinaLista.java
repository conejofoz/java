package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RotinaLista {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Silvio");
		lista.add("Gilberto");
		lista.add("Gelson");
		lista.add("Gonzaga");
		lista.add("Jo�o");
		
		System.out.println("Tamanho da lista: " + lista.size());
		
		for(String nome : lista) {
			System.out.println(nome);
		}
		
		lista.remove("Silvio");
		
		lista.removeIf(x -> x.charAt(0) == 'J');
		
		System.out.println("index of de Gelson: " + lista.indexOf("Gelson"));
		System.out.println("index of de Maria: " + lista.indexOf("Maria"));
		
		
		//criar uma nova lista com os nomes que come�am com a letra G
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());
		
		//Filtrar o primeiro nome que come�a com a letra G
		String xnome = lista.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
		System.out.println("x nome: " + xnome);
		
		
		
		
		
		for(String nome : lista) {
			System.out.println(nome);
		}
		
		for(String nome : resultado) {
			System.out.println(nome);
		}

	}

}
