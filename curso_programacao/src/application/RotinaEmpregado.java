package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class RotinaEmpregado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> lista = new ArrayList<>();
		
		System.out.print("Informe a quantidade de funcion�rios: ");
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			System.out.println("Empregado #: " + ( i + 1 ) + ": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while(hasId(lista, id)) {
				System.out.println("Esse funcion�rio j� existe tente novamente");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			Empregado empregado = new Empregado(id, nome, salario);
			
			lista.add(empregado);
			
		}
		
		System.out.println();
		
		System.out.print("Informe o id do funcion�rio que ir� receber aumento: ");
		int idSalario = sc.nextInt();
		
		Integer pos = posicao(lista, idSalario);
		if(pos == null) {
			System.out.println("Esse empregado n�o existe");
		} else {
			System.out.println("Digite a porcentagem");
			double porcentagem = sc.nextDouble();
			lista.get(pos).aumentoSalario(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de funcionarios");
		for (Empregado empregado : lista) {
			System.out.println(empregado.toString());
		}
		
		
		
		sc.close();
	}
	
	public static Integer posicao(List<Empregado> lista, int id) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				return i;
			}
		}
		
		
		return null;
	}
	
	
	public static boolean hasId(List<Empregado> lista, int id) {
		Empregado empregado = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return empregado != null;
	}

}
