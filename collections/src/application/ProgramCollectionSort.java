package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Funcionario;


public class ProgramCollectionSort {

	public static void main(String[] args) {
		
		
		List<Funcionario> listaFuncionarios = new ArrayList<>();
		
		String path = "C:\\prj\\salario.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String linha = br.readLine();
			
			while(linha != null) {
				String[] arrayCampos = linha.split(",");
				//String nome = arrayCampos[0];
				//Double salario = Double.parseDouble(arrayCampos[1]);
				//Funcionario funcionario = new Funcionario(nome, salario);
				//listaFuncionarios.add(funcionario);
				//listaFuncionarios.add(new Funcionario(nome, salario));
				listaFuncionarios.add(new Funcionario(arrayCampos[0], Double.parseDouble(arrayCampos[1])));
				linha = br.readLine(); //esqueci essa linha e estourou a memória do computador
			}
			
			
			
			Collections.sort(listaFuncionarios);
			
			
			for(Funcionario func : listaFuncionarios) {
				System.out.println(func.getNome() + " " +func.getSalario());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
