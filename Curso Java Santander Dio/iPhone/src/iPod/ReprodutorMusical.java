package iPod;
import java.util.Scanner;

import Usuario.Menu;

public class ReprodutorMusical {
	Scanner scanner = new Scanner(System.in);

	public ReprodutorMusical() {
		// TODO Auto-generated constructor stub
	}
	
	private void tocar() {
		System.out.println("Tocando Música! Se quiser pausar só digitar 1.");
		int pausar = scanner.nextInt();
		if (pausar == 1){
			pausar();
		}else {
			tocar();
		}
		
		
	}
	
	private void pausar() {
		System.out.println("Música Pausada! Se quiser tocar digite 1, mas se quiser selecionar digite 2 e digite 3 se quiser sair.");
		int escolher = scanner.nextInt();
		switch (escolher) {
		case 1: {
			
			tocar();
		}
		case 2: {
			selecionarMusica();
		}
		default:
			System.out.println("Saindo!");
			Menu menu = new Menu();
			menu.menu();
		}
	}
	
	public void selecionarMusica() {
		int tocar = 0;
		do {
			
			System.out.println("Selecionando Música!");
			System.out.println("Musica selecionada! Digite 1 se deseja tocar ou 2 para selecionar.");
			tocar = scanner.nextInt();
			
		}while(tocar != 1);
		tocar();
	}

}
