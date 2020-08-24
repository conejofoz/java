package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program5ComoTreeSetCompara {

	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet<>();
		
		//Como o TreeSet utiliza o comparable para comparar, na classe Product tem que implementar o comparable
		
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		for(Product product : set) {
			System.out.println(product);
		}
	}

}
