package repeticao;

import javax.swing.JOptionPane;

public class ExercicioGeral {

	public static void main(String[] args) {
		/*
		 * Monte uma aplica��o que solicite a idade e o nome das pessoas
		 * Ao terminar (o usu�rio respondeu que n�o quer continuar),
		 * o aplica��o dever� existir
		 * a pessoa mais velha (nome), (3)
		 * a pessoa mais nova (nome), (4)
		 * a quantidade de pessoas maiores de idade e (1)
		 * e a m�dia entre as idades que foram digitadas. (2) 
		 */

		String nome="";
		int idade=0;
		char resposta=0;
		int qtdeMaiores=0;
		int totalIdades=0;
		int qtdePessoas=0;
		String nomeJovem="";
		String nomeExperiente="";
		int idadeJovem=0;
		int idadeExperiente=0;



		do {

			nome=JOptionPane.showInputDialog("Nome").toUpperCase();
			idade=Integer.parseInt(JOptionPane.showInputDialog("Idade"));

			if (idade>idadeExperiente) {
				nomeExperiente = nome;
				idadeExperiente = idade;

			}

			if (idade<idadeJovem) {
				nomeJovem = nome;
				idadeJovem = idade;
			}

			if (idade>17) {
				qtdeMaiores++;
			}

			totalIdades= totalIdades+idade;
			qtdePessoas++;
			resposta = JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase().charAt(0);
		}while(resposta=='S');

		System.out.println("Qtde de Pessoas maiores de idade: " + qtdeMaiores);
		System.out.println("M�dia de idade: " + (totalIdades/qtdePessoas));
		System.out.println(nomeExperiente + " � o mais experiente com "  + idadeExperiente + " anos");
		System.out.println(nomeJovem + " � o mais experiente com " + idadeJovem + " anos");
		



	}

}
