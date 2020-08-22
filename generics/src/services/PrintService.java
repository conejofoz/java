package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<G> {
	
	private List<G> lista = new ArrayList<>();
	
	public void addValue(G value) {
		lista.add(value);
	}
	
	public G first(){
		if(lista.isEmpty()) {
			throw new IllegalStateException("Lista vazia");
		}
		return lista.get(0);
	}
	
	public void print() {
		System.out.print("[");
		System.out.print(lista.get(0));
		for(int i = 1; i < lista.size(); i++) {
			System.out.print(", " + lista.get(i));
		}
		System.out.print("]");
	}
	
	
}
