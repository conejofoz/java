package entities;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(String nome, double preco, int quantidade){
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}
	
	
	
	
	
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double estoqueTotal() {
		return quantidade * preco;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	@Override
	public String toString() {
		
		return 
				nome
				+ ", $"
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ " unidades, Total: $ "
				+ String.format("%.2f", estoqueTotal());
		}
	
	
	

}
