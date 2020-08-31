package entities;

public class Funcionario implements Comparable<Funcionario> {

	
	private String nome;
	private Double Salario;

	
	public Funcionario(String nome, Double salario) {
		this.nome = nome;
		Salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getSalario() {
		return Salario;
	}


	public void setSalario(Double salario) {
		Salario = salario;
	}


	@Override
	public int compareTo(Funcionario o) {
		//só para reforçar esse método tem que retornar um inteiro
		//return 0;
		//como o tipo String já implementa o comparable por padrão
		//comparando String com String se forem iguais vai retornar zero
		return nome.compareTo(o.getNome());
	}


	
	
	
	
	
}
