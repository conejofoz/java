

public class FuncoesDeStrings {

	public static void main(String[] args) {
		
		String nome = "Silvio coelho   ";
		
		String x1 = nome.toLowerCase();
		String x2 = nome.toUpperCase();
		String x3 = nome.trim();
		String x4 = nome.substring(6);
		String x5 = nome.substring(0,6);// recorta apartir de p1 abaixo de p2
		String x6 = nome.replace("il", "iu");
		
		int i = nome.indexOf("o");
		int j = nome.lastIndexOf("o");
		
		System.out.println("Original---:" + nome);
		System.out.println("Min�scula--:" + x1);
		System.out.println("Mai�scula--:" + x2);
		System.out.println("Trim-------:" + x3);
		System.out.println("Substring--:" + x4);
		System.out.println("Substring--:" + x5);
		System.out.println("replace....:" + x6);
		
		System.out.println("Primeira ocorr�ncia da letra o " + i);
		System.out.println("�ltima ocorr�ncia da letra o   " + j);
		
		
		String[] vetor = nome.split(" ");
		String primeiroNome = vetor[0];
		String sobrenome = vetor[1];
		
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Segundo nome: " + sobrenome);
	}

}
