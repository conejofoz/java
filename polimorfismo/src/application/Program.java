package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> listaFuncionarios = new ArrayList<>();
		
		System.out.print("Informe o número de funcionários: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Funcionario #" + i + "dados:");
			System.out.print("Terceirizado (s/n");
			char ch = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			
			if(ch == 's') {
				System.out.print("Valor adicional: ");
				double valorAdicional = sc.nextDouble();
				Funcionario funcionario = new FuncionarioTerceirizado(nome, horas, valorPorHora, valorAdicional);
				listaFuncionarios.add(funcionario);
			} else {
				//Funcionario funcionario = new Funcionario(nome, horas, valorPorHora);
				//listaFuncionarios.add(funcionario);
				listaFuncionarios.add(new Funcionario(nome, horas, valorPorHora));
			}
		}
		

		System.out.println();
		System.out.println("PAGAMENTOS: ");
		for(Funcionario funcionario : listaFuncionarios) {
			System.out.println(funcionario.getNome() + " - R$ " + String.format("%.2f", funcionario.pagamento()));
		}
		
		
		
		sc.close();
	}

}
