package application;

import java.io.File;
import java.util.Scanner;

public class ArquivoInformacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("Nome do arquivo.......:" + path.getName());
		System.out.println("Diret�rio do arquivo..:" + path.getParent());
		System.out.println("Caminho completo......:" + path.getPath());
		System.out.println("Caminho absoluto......:" + path.getAbsolutePath());

	}

}
