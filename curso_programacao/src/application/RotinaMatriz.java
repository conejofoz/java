package application;

import java.util.Scanner;

public class RotinaMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o tamanho da matriz: ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal da matriz: ");
		for(int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		//CONTAR QUANTOS N�MEROS NEGATIVOS TEM NA MATRIZ
		System.out.println();
		int negativos = 0;
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				negativos++;
			}
		}
		
		System.out.println("Quantidade de n�meros negativos encontrados na matriz: " + negativos);
		
		
		sc.close();
	}

}
