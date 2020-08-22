package services;

import java.util.List;

public class CalculationService {
	
	public static <T extends Comparable<T>> T max(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("Lista vazia");
		}
		T aux = list.get(0);
		for(T item : list) {
			if(item.compareTo(aux) > 0) {
				aux = item;
			}
		}
		return aux;
	}
}
