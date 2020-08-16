import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		
		mostrarResultado(maior);
		
		

		sc.close();
	}
	
	
	/* Fun��o que retorna valor*/
	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		} else if(y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
		
	}
	
	
	/* Fun��o sem retorno*/
	public static void mostrarResultado(int param) {
		System.out.println("O maior n�mero � o : " + param);
	}

}
