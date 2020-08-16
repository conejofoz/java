package entities;

public class Conta {
	private Integer numero;
	private String titular;
	protected Double saldo; //precisa ser acessado pela classe filha
	
	public Conta() {
		
	}

	public Conta(Integer numero, String titular, Double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	/*
	 * public void setSaldo(Double saldo) { this.saldo = saldo; }
	 */
	
	
	public void saque(double valor) {
		saldo -= valor;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	
}
