package Internet;

import java.util.Scanner;

import Usuario.Menu;

public class NavegadorInternet {

	public NavegadorInternet() {
		// TODO Auto-generated constructor stub
	}
	
	public void exibirPagina() {
		System.out.println("Exibindo Pagina");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o que deseja:");
		System.out.println("Informe o que deseja fazer:");
		System.out.println("1 - adicionar nova aba");
		System.out.println("2 - atualizar pagina");
		System.out.println("3 - Voltar a pagina inicial");
		int pagina = scanner.nextInt();
		switch (pagina) {
		case 1: {
			
			adicionarNovaAba();
			break;
		}
		case 2: {
			
			atualizarPagina();
			break;
		}
		default:{
			Menu menu = new Menu();
			menu.menu();
			
		}
		}
	}
	
	private void adicionarNovaAba() {
		System.out.println("Adicionando Pagina");
		exibirPagina();
	}
	
	private void atualizarPagina() {
		
		System.out.println("Atualizando Pagina");
		exibirPagina();

	}

}
