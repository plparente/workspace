package br.com.lojauati.teste;

import javax.swing.JOptionPane;

import br.com.lojauati.modelo.Formula1;

public class TesteFormula1 {

	public static void main(String[] args) {
		Formula1 objeto; //criando um objeto
		//objeto.preencherEscuderia("ferrari"); N�O FUNCIONA
		
		Formula1 carro = new Formula1(); // instanciando um objeto
		carro.preencherEscuderia(JOptionPane.showInputDialog("Digite a escuderia"));
		carro.preencherRpm(Integer.parseInt(JOptionPane.showInputDialog("RPM")));
		carro.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Valor")));
		//output
		System.out.println("Escuderia.: " + carro.exibirEscuderia());
		System.out.println("RPM.......: " + carro.exibirRpm());
		System.out.println("Valor.....: " + carro.exibirValor());
		
			

	}

}
