package be.com.ecommerce.implementacao;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.ecommerce.tela.Magica;

public class TesteVenda {

	
	
	public static void main(String[] args) {
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		Produto produto = new Produto();
		//faz a amarração(ligação)
		cliente.setEndereco(endereco);
		venda.setProduto(produto);
		venda.setCliente(cliente);
		// fim da amarração
		
		endereco.setBairro(Magica.s("BAIRRO"));
		endereco.setLogradouro(Magica.s("LOGRADOURO"));
		endereco.setCidade(Magica.s("CIDADE"));
		endereco.setEstado(Magica.s("ESTADO"));
		endereco.setCep(Magica.s("CEP"));
		endereco.setComplemento(Magica.s("COMPLEMENTO"));
		endereco.setNumero(Magica.s("NÚMERO"));
			
		cliente.setId(1);
		cliente.setNome("NOME");
		cliente.setEndereco(endereco);
				
		produto.setDescricao("DESCRIÇÃO");
		produto.setQtde(15);
		produto.setValorVenda(Magica.f("VALOR DA VENDA"));
		produto.setValorCompra(Magica.f("VALOR DA COMPRA"));
		produto.setId(015);
		
		venda.setTotal(15);
		venda.setData("DATA");
		venda.setNotaFiscal(15);
		
		System.out.println(venda.getAll());
		
		
		
		
		
		
		
		
		
		
	}

}
