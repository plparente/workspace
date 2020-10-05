package br.com.ecommerce.modelo;

import br.com.ecommerce.modelo.Endereco;

public class Desconsiderar {

	private int id;
	private String descricao;
	private int qtde;
	private float valorCompra;
	private float valorVenda;
	private Endereco endereco;
	
	
	public String getAll() {
		return
				"C�digo......: " + id + "\n" + 
				"Descri��o...: " + descricao + "\n" + 
				"Quantidade..: " + qtde + "\n" + 
				"ValorCompra.: " + valorCompra + "\n" + 
				"ValorVenda..: " + valorVenda + "\n" +
				"Endereco....: " + endereco;
	}
	
	public void setAll(int id, String descricao, int qtde, float valorCompra, float valorVenda, Endereco endereco) {
		this.id = id;
		this.descricao=descricao;
		this.qtde=qtde;
		this.valorCompra=valorCompra;
		this.valorVenda=valorVenda;
		this.endereco=endereco;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
