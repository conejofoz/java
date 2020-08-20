package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoFileWriter {

	public static void main(String[] args) {
		
		/* Escrever arquivo / criar arquivo */
		
		String[] lines = new String[] {"000011", "Recebimento de valores", "R$ 250.00"};
				
		String path = "C:\\prj\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
