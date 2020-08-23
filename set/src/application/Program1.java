package application;

import java.util.HashSet;
import java.util.Set;

public class Program1 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		/*
		 * Se a ordem não importa o HashSet é o mais indicado por ser o mais rápido
		 */
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
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
