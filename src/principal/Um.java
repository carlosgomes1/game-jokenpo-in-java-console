package principal;

import java.util.Scanner;
import java.util.Random;

public class Um {

	public static void main(String[] args) {
		int jogador, pc, contEmpate = 0, contVitoria = 0, contDerrota = 0, jogarNov = 0, invalid = 0;
		boolean closeProgram = true, jogadas = true, again = true, nov = true;
		
		Scanner ler = new Scanner(System.in);
		Random rand = new Random();
		
		while (closeProgram == true) {
			
			while (jogadas == true) {
				pc = rand.nextInt(3);
				
				System.out.println("   ");
				System.out.println("Vamos jogar JOKENPO!");
				System.out.println("Escolha uma op��o:");
				System.out.println("[0] PEDRA");
				System.out.println("[1] PAPEL");
				System.out.println("[2] TESOURA");
				System.out.println("Sua op��o: ");
				System.out.println("   ");
				
				jogador = ler.nextInt();
				
				while (nov == true) {
					if (jogador != 0 && jogador != 1 && jogador != 2) {
						System.out.println("OP��O INV�LIDA, DIGITE NOVAMENTE");
					}
					if (jogador == 0 || jogador == 1 || jogador == 2) {
						nov = false;
					}
				}
				
				if (jogador == 0 && pc == 0) {
					System.out.println("   ");
					System.out.println("Voc� escolheu PEDRA");
					System.out.println("PC escolheu PEDRA");
					contEmpate += 1;
					System.out.println("EMPATE!");
				}
				
				if (jogador == 0 && pc == 1) {
					System.out.println("   ");
					System.out.println("Voc� escolheu PEDRA");
					System.out.println("PC escolheu PAPEL");
					contDerrota += 1;
					System.out.println("PERDEU!");
				}
				
				if (jogador == 0 && pc == 2) {
					System.out.println("   ");
					System.out.println("Voc� escolheu PEDRA");
					System.out.println("PC escolheu TESOURA");
					contVitoria += 1;
					System.out.println("VIT�RIA!");
				}
				
				if (jogador == 1 && pc == 0) {
					System.out.println("   ");
					System.out.println("Voc� escolheu PAPEL");
					System.out.println("PC escolheu PEDRA");
					contVitoria += 1;
					System.out.println("VIT�RIA!");
				}

				if (jogador == 1 && pc == 1) {
					System.out.println("   ");
					System.out.println("Voc� escolheu PAPEL");
					System.out.println("PC escolheu PAPEL");
					contEmpate += 1;
					System.out.println("EMPATE!");
				}
				
				if (jogador == 1 && pc == 2) {
					System.out.println("   ");
					System.out.println("Voc� escolheu PAPEL");
					System.out.println("PC escolheu TESOURA");
					contDerrota += 1;
					System.out.println("PERDEU!");
				}
				
				if (jogador == 2 && pc == 0) {
					System.out.println("   ");
					System.out.println("Voc� escolheu TESOURA");
					System.out.println("PC escolheu PEDRA");
					contDerrota += 1;
					System.out.println("PERDEU!");
				}

				if (jogador == 2 && pc == 1) {
					System.out.println("   ");
					System.out.println("Voc� escolheu TESOURA");
					System.out.println("PC escolheu PAPEL");
					contVitoria += 1;
					System.out.println("VIT�RIA!");
				}

				if (jogador == 2 && pc == 2) {
					System.out.println("   ");
					System.out.println("Voc� escolheu TESOURA");
					System.out.println("PC escolheu TESOURA");
					contEmpate += 1;
					System.out.println("EMPATE!");
				}
				
				System.out.println("--------------------------------");
				System.out.println("Voc� deseja jogar novamente? ");
				System.out.println("[0] SIM");
				System.out.println("[1] N�O");
				System.out.println("   ");
				
				jogarNov = ler.nextInt();
					
				while (again == true) {

					if (jogarNov != 0 && jogador != 1) {
						System.out.println("OP��O INV�LIDA");
					}
					if (jogarNov == 0 || jogador == 1) {
						again = false;
					}	
				}
				
				if (jogarNov == 1) {
					jogadas = false;
				}
			}
			System.out.println("   ");
			System.out.println("VIT�RIAS: " + contVitoria);
			System.out.println("EMPATES: " + contEmpate);
			System.out.println("DERROTAS: " + contDerrota);

			closeProgram = false;
		}
		
		System.out.println("OBRIGADO POR JOGAR!");
	}

}
