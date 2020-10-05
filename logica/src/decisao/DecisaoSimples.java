package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
	/*
	 * Identificadores = nomes (classes, variaval...)
	 * Regras:
	 * 	 1� N�o come�ar�s com n�mero .... 1berto (errado), h1berto (certo)
	 * 	 2� N�o usar�s caracteres especiais (@, #, ~, etc...), exce��o: underline (_)
	 * 	 3� N�o utilizar�s palavras reservadas da linguagem (class, int, main, public...)
	 *  
	 * Padroes (vari�veis):
	 * - nomes significativos
	 * - sempre come�am com letras minusculas
	 * - utilizar o padr�o Camel Case (nomeDoCliente) 
	 */
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
		float media = (nota1 + nota2) /2;
		System.out.println("Aluno: " + nome + " sua m�dia foi: " + media);
		if (media>=6) {
			System.out.println("Parabens " + nome + " voc� est� aprovado!!!");
		}
			
			if (media<4) {
				System.out.println("Infelizmente " + nome + " voc� foi reprovado!!!");
		}
			
			
			if (media<6 && media>=4) {
				System.out.println(nome + " voc� ainda tem chance no exame!!!");
			}
			
			
		// and = &&
		// or => ||
		// se a media estiver entre 5.9 e 4 tem que mostrar: "xxxx voc� ainda tem chance no exame"
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}