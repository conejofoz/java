import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int hora;
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Informe a hora: ");
		hora = scanner.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia");
		} else {
			if(hora < 18) {
				System.out.println("Boa tarde");
			} else {
				System.out.println("Boa noite");	
			}
			
		}
		

	}

}