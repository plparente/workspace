package repeticao;

import javax.swing.JOptionPane;

public class DesafioRepeticao {

	public static void main(String[] args) {
		/*
		 * Jogador 1: vai digitar um n�mero inteiro
		 * Jogador 2: tem que descobrir esse n�mero
		 * Exibir o Parab�ns para o Jogador 2 quando ele descobrir
		 * * Atualiza��es:
		 * - O jogador 2 ir� receber dicas enquanto ele n�o acertar
		 * - No final tem que exibir quantas tentativas foram utilizadas pelo jogador 2
		 */

		int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int jogador2 = 0;
		int tentativas = 0;
		do {
			jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o n�mero?"));
			if (jogador2 > jogador1) {
				System.out.println("Quase, tente um n�mero menor");
			}else if (jogador2 < jogador1) {
				System.out.println("Quase, tente um n�mero maior");
			}
			tentativas = tentativas+1;
		}while(jogador2!=jogador1);
		System.out.println("PARAB�NS " + tentativas + " tentativas!");
	}

}
