package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramUrna {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votes = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		// c:\\prj\\urna.txt

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				
				String name = fields[0];
				int newqtd = Integer.parseInt(fields[1]);

				if (votes.containsKey(name)) {
					//se o nome já existir no map pega a quantidade e soma com a nova
					int oldqtd = votes.get(name); //chave / valor...name é a chave e a quantidade é o valor dessa chave
					votes.put(name, newqtd + oldqtd);
				}
				else {
					votes.put(name, newqtd);
				}
				
				line = br.readLine();
			}
			
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
