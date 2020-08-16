import java.util.Scanner;

public class Operadora {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int horas;
		double valorExcedente = 2;
		double conta = 50;
		System.out.println("Informe o numero de horas: ");
		horas = scanner.nextInt();
		
		if(horas > 100) {
			conta += (horas -100) * valorExcedente;
		} 
		
		System.out.println("o valor é: R$" + conta);

	}

}
