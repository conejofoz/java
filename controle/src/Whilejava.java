import java.util.Scanner;

public class Whilejava {

	public static void main(String[] args) {
		
		int x;
		int soma = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		while (x != 0) {
			soma = soma + x;
			System.out.println("Digite um n�mero: ");
			x = sc.nextInt();
		}
		System.out.println(soma);

	}

}
