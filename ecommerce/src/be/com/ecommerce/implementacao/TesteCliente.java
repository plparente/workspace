package be.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		
		endereco.setLogradouro(JOptionPane.showInputDialog("Logradouro"));
		endereco.setBairro(JOptionPane.showInputDialog("Bairro"));
		endereco.setCidade(JOptionPane.showInputDialog("Cidade"));
		endereco.setEstado(JOptionPane.showInputDialog("Estado"));
		endereco.setCep(JOptionPane.showInputDialog("CEP"));
		endereco.setNumero(JOptionPane.showInputDialog("Numero"));
		endereco.setComplemento(JOptionPane.showInputDialog("Complemento"));
		
		
	}

}
