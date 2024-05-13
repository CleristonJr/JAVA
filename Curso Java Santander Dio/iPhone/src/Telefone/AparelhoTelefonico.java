package Telefone;

import java.util.Random;
import java.util.Scanner;

import Usuario.Menu;

public class AparelhoTelefonico {

	public AparelhoTelefonico() {
		// TODO Auto-generated constructor stub
	}
	
	public void ligar() {
		
	
		System.out.println("Ligando");
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atendeu();
			continuarTentando = !atendeu;
			if (continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("Contato realizado com sucesso!");
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(!atendeu)
			System.out.println("Não conseguimos contato!");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o que deseja:");
		System.out.println("Informe o que deseja fazer:");
		System.out.println("1 - Ligar");
		System.out.println("2 - Correio de Voz");
		System.out.println("3 - Voltar a pagina inicial");
		int ligar = scanner.nextInt();
		switch (ligar) {
		case 1: {
			
			ligar();
			break;
		}
		case 2: {
			
			iniciarCorreioVoz();
			break;
		}
		default:{
			Menu menu = new Menu();
			menu.menu();
			
		}
		}
		
	}
	
	public void atender() {
		System.out.println("Atendeu a ligação");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Correio de Voz iniciado");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o que deseja:");
		System.out.println("Informe o que deseja fazer:");
		System.out.println("1 - Ligar");
		System.out.println("2 - Correio de Voz");
		System.out.println("3 - Voltar a pagina inicial");
		int ligar = scanner.nextInt();
		switch (ligar) {
		case 1: {
			
			ligar();
			break;
		}
		case 2: {
			
			iniciarCorreioVoz();
			break;
		}
		default:{
			Menu menu = new Menu();
			menu.menu();
			
		}
		}
	}
	
	static boolean atendeu() {
		return new Random().nextInt(3)==1;
	}

}
