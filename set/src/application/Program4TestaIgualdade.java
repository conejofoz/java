package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program4TestaIgualdade {

	public static void main(String[] args) {
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		//false se o produto não possuir o método equals e hashCode
		//o compilador compara pelo endereço de memória 
		//como são instâncias diferentes vai dar false
		//se tiver hashCode e equals ele vai comparar pelo conteúdo e vai dar true
		System.out.println(set.contains(prod));

	}

}
