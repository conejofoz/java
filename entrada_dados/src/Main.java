import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * String x;
		 * 
		 * x = sc.next();
		 * 
		 * System.out.println("Voc� digitou: " + x);
		 * 
		 * 
		 * 
		 * Scanner numero = new Scanner(System.in); int y; y = numero.nextInt();
		 * System.out.println("Voc� digitou o n�mero " + y);
		 */

		// Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int x;
		String a,b,c;
		x = scanner.nextInt();
		scanner.nextLine(); //limpa o buffer
		a = scanner.nextLine();
		b = scanner.nextLine();
		c = scanner.nextLine();
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		scanner.close();

	}

}
