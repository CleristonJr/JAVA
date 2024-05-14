package usuario;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> itemList;

	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		List<Item> itemParaAdicionar = new ArrayList<>();
		for (Item i : itemList) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itemParaAdicionar.add(i);
			}
		}
		itemList.add(new Item(nome, preco, quantidade));
		
	}
	
	public void removerItem(String nome) {
		List<Item> itemParaRemover = new ArrayList<>();
		for (Item i : itemList) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itemParaRemover.add(i);
			}
		}
		itemList.removeAll(itemParaRemover);
	}
	
	public double calcularValorTotal() {
		double valor = 0;
		for (Item item : itemList) {
			double valorItem = item.getPreco()*item.getQuantidade();
			valor += valorItem;
			
		}
		
		return valor;
	}
	
	public void exibirItens() {
		
		System.out.println(itemList);
		
	}
	
	public static void main(String[] args) {
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adicionarItem("Item 1", 20, 2);
		carrinhoDeCompras.adicionarItem("Item 2", 10, 3);
		carrinhoDeCompras.adicionarItem("Item 1", 20.6, 7);
		carrinhoDeCompras.adicionarItem("Item 3", 45, 2);
		carrinhoDeCompras.adicionarItem("Item 1", 20, 2);
		carrinhoDeCompras.adicionarItem("Item 2", 12.4, 1);
		
		System.out.println("A lista é: "  );
		carrinhoDeCompras.exibirItens();
		
		System.out.println("O Valor total = " + carrinhoDeCompras.calcularValorTotal());
	}

}
