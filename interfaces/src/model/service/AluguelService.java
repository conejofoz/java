package model.service;

import model.entities.AluguelCarro;
import model.entities.Fatura;

public class AluguelService {
	
	private Double precoPorDia;
	private Double precoPorHora;
	
	private ImpostoServico impostoServiço;

	public AluguelService(Double precoPorDia, Double precoPorHora, ImpostoServico impostoServiço) {
		super();
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.impostoServiço = impostoServiço;
	}
	
	
	public void processaFatura(AluguelCarro aluguelCarro) {
		long t1 = aluguelCarro.getInicio().getTime();
		long t2 = aluguelCarro.getFim().getTime();
		double horas = (double)(t2 - t1) /1000 / 60 / 60;
		double pagamentoBasico;
		
		if(horas <= 12.0) {
			pagamentoBasico = Math.ceil(horas) * precoPorHora;
		} else {
			pagamentoBasico = Math.ceil(horas / 24) * precoPorDia;
		}
		
		double imposto = impostoServiço.imposto(pagamentoBasico);
		
		aluguelCarro.setFatura(new Fatura(pagamentoBasico, imposto));
		
	}

}
