package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program2 {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		
		
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		//set.remove("Tablet");
		
		// remova todo elemento x tal que x seja maior ou igual a tres
		set.removeIf(x -> x.length() >= 3);
		
		// remova todo mundo que tenha a primeira letra = T
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for(String p : set) {
			System.out.println(p);
		}
		
		System.out.println("Tem Notebook? " +set.contains("Notebook"));
		
		if(set.contains("Notebooksss")) {
			System.out.println("sim");
		} else {
			System.out.println("não");
		}

	}

	}


