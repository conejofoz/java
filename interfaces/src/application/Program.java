package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.service.AluguelService;
import model.service.BrazilImpostoServico;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println(("Digite os dados do aluguel"));
		System.out.println("Modelo do carro: ");
		String modeloCarro = sc.nextLine();
		System.out.println("Início: (dd/MM/yyyy)");
		Date inicio = sdf.parse(sc.nextLine());
		System.out.println("Fim: (dd/MM/yyyy)");
		Date fim = sdf.parse(sc.nextLine());
		
		AluguelCarro cr = new AluguelCarro(inicio, fim, new Veiculo(modeloCarro));
		
		System.out.println("Digite o preço por hora;");
		double precoPorHora = sc.nextDouble();
		System.out.println("Digite o preço por dia;");
		double precoPorDia = sc.nextDouble();
		
		AluguelService aluguelService = new AluguelService(precoPorDia, precoPorHora, new BrazilImpostoServico());
		
		aluguelService.processaFatura(cr);
		
		System.out.println("FATURA");
		System.out.println("Pagamento básico: " + String.format("%.2f", cr.getFatura().getPagamentoBasico()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getFatura().getImposto()));
		System.out.println("Total do pagamento: " + String.format("%.2f", cr.getFatura().getPagamentoTotal()));
		
		
				
		
		
		sc.close();

	}

}
