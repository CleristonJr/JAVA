package list.OperacoesBasicas;

public class Item {
	
	private String nome;
	private double preco;
	private int quantidade;

	public Item(String nome, double preco, int quantidade) {
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
		// TODO Auto-generated constructor stub
	}
	
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Item: {" +
		"Nome=  " + nome + "; Preço= " + preco + "; Quantidade= " + quantidade + "; " +
		'\'' +
		'}';
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

}
