package application;

import java.io.BufferedReader;
import java.io.FileReader;

public class Arquivo_try_with_resources {

	public static void main(String[] args) {
		
		//String caminho = "C:\\in.txt";
		String caminho = "C:\\PRJ\\PYTHON\\sistema\\manage.py";
				
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			String linha = br.readLine();
			
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}

}
