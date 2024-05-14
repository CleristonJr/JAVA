package Usuario;

import java.util.Scanner;

import Internet.NavegadorInternet;
import Telefone.AparelhoTelefonico;
import iPod.ReprodutorMusical;

public class Menu {

	public Menu() {

		// TODO Auto-generated constructor stub
	}
	
	public void menu() {

		NavegadorInternet navegador = new NavegadorInternet();
		ReprodutorMusical reprodutor = new ReprodutorMusical();
		AparelhoTelefonico telefone = new AparelhoTelefonico();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o que deseja fazer:");
		System.out.println("1 - Navegar na Internet");
		System.out.println("2 - Reprodutor Musical");
		System.out.println("3 - Telefone");
		System.out.println("4 - Desligar Aparelho");
		
		int escolha = scanner.nextInt();
		
		switch (escolha) {
		case 1: {
			navegador.exibirPagina();
			break;
			
		}
		case 2:{
			
			reprodutor.selecionarMusica();
			break;
				
			
		}
		case 3:{
			
			System.out.println("Informe o que deseja fazer:");
			System.out.println("1 - Ligar");
			System.out.println("2 - Correio de Voz");
			int ligar = scanner.nextInt();
			switch (ligar) {
			case 1: {
				
				telefone.ligar();
				break;
			}
			case 2: {
				
				telefone.iniciarCorreioVoz();
				break;
			}
			default:{
				menu();
				
			}
				
			}
			
		}
		default:{
			System.out.println("Desligando!");
		}

	}
	
	}
}
