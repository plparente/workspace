package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		/*
		 * Solicitar: nome e idade da pessoa e ir�o exibir:
		 * 
		 * "� obrigado a votar" => maior ou igual a 18 e menor que 70
		 * "Voto facultativo" => 16, 17 ou mais que 70
		 * "N�o pode votar" => menores de 16 anos
		 * 
		 */

		String nome = JOptionPane.showInputDialog("Qual o nome?").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Qual a idade?"));
		
		if (idade<16) {
			System.out.println("N�o pode votar!!!");
		}
		
		if (idade>=18 && idade<=70) {
			System.out.println("� obrigado a votar!!!");
		}
		
			if (idade==16 || idade==17 || idade>70) {
				System.out.println("Voto facultativo!!!");
									
		}
		
		
	}

}
