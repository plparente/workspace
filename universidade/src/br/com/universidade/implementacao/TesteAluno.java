package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Endereco;

public class TesteAluno {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setLogradouro(JOptionPane.showInputDialog("Logradouro"));
		endereco.setBairro(JOptionPane.showInputDialog("Bairro"));
		endereco.setCidade(JOptionPane.showInputDialog("Cidade"));
		Aluno aluno = new Aluno();
		aluno.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("Matricula")), 
				JOptionPane.showInputDialog("Nome").toUpperCase(), 
				JOptionPane.showInputDialog("Email").toUpperCase(),
				endereco
				);
			System.out.println(aluno.getAll());
	}

}
