import java.util.Locale;

public class Main {

	
	public static int idade = 25;
	
	public static void main(String[] args) {
		
		System.out.println("Ol� mundo");
		
		System.out.println("a idade �: " + idade);
		
		double x = 10000.35784;
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		//concatena��o com printf o valor da vari�vel vai ser escrito onde est� a formata��o
		System.out.printf("o valor da vari�vel � %.2f metros%n", x);
		
		String nome = "Silvio";
		int idade = 46;
		double renda = 4000.0;
		
		System.out.printf("Meu nome � %s, eu tenho %d anos e ganho US$ %.2f por m�s.%n", nome,idade,renda);

	}

}
