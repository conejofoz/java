package model.service;

public class BrazilImpostoServico {
	
	public double imposto(double valor) {
		if(valor <= 100.0) {
			return valor * 0.2;
		} else {
			return valor * 0.15;
		}
	}

}
