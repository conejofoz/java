import java.util.Locale;

public class Main {

	
	public static int idade = 25;
	
	public static void main(String[] args) {
		
		System.out.println("Olá mundo");
		
		System.out.println("a idade é: " + idade);
		
		double x = 10000.35784;
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		//concatenação com printf o valor da variável vai ser escrito onde está a formatação
		System.out.printf("o valor da variável é %.2f metros%n", x);
		
		String nome = "Silvio";
		int idade = 46;
		double renda = 4000.0;
		
		System.out.printf("Meu nome é %s, eu tenho %d anos e ganho US$ %.2f por mês.%n", nome,idade,renda);

	}

}
