import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		
		mostrarResultado(maior);
		
		

		sc.close();
	}
	
	
	/* Função que retorna valor*/
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
	
	
	/* Função sem retorno*/
	public static void mostrarResultado(int param) {
		System.out.println("O maior número é o : " + param);
	}

}
