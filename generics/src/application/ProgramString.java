package application;

import java.util.Scanner;

import services.PrintService;

public class ProgramString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<String> ps = new PrintService<>();
		
		System.out.println("Quantos nomes: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String nome = sc.next();
			ps.addValue(nome);
		}
		
		ps.print();
		String first = ps.first();
		System.out.println();
		System.out.println(first);

	}

}
