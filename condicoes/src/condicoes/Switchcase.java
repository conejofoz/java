package condicoes;
import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		int x;
		String dia = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o dia: ");
		x = scanner.nextInt();
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Ter�a";
			break;
		case 4: 
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "S�bado";
			break;
		default:
			dia = "Valor inv�lido";
			break;
		}
		
		System.out.println(dia);
		
		scanner.close();

	}

}
