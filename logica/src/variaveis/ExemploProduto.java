package variaveis;

import javax.swing.JOptionPane;

public class ExemploProduto {

	public static void main(String[] args) {
		// Solicitar os dados:
		// nome do produto
		//quantidade
		//valor
		//Exibir o total e o nome do produto
		//Exibir o total com 10% de desconto
		
		
		String nome = ""; 
		int produto = 0; 
		double quantidade=0; 
		double valor=0;
		double total=0;
		
		nome = JOptionPane.showInputDialog("Digite o nome do produtos");
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
		total = valor * quantidade;
		
		double desconto = (valor * quantidade) * 0.9;
		System.out.println("nome:..." + nome);
		System.out.println("quantidade:.." + quantidade);
		System.out.println("valor:." + valor);
		System.out.println("nome...:" + nome);
		System.out.println("total..." + total);
		System.out.println("com desconto....:" + desconto);

	}

}