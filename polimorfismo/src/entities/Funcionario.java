package entities;

public class Funcionario {
	
	private String nome;
	private Integer horas;
	private Double ValorPorHora;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, Integer horas, Double valorPorHora) {
		//super();
		this.nome = nome;
		this.horas = horas;
		ValorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorPorHora() {
		return ValorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		ValorPorHora = valorPorHora;
	}
	
	public double pagamento() {
		return horas * ValorPorHora;
	}
	
	

}
