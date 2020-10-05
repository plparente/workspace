package br.com.ecommerce.modelo;

/*
 * DTO => Modelo / Beans / JavaBeans
 * 1� Todos os atributos devem ser privados
 * 2� Todos os atributos devem possuir individualmente os m�todos getter e setter
 * 3� 
 */ 

public class Cliente {

	private int id;
	private String nome;
	private Endereco endereco;
	
	public Cliente(int i, String n, Endereco e) {
		id=i;
		nome=n;
		endereco=e;
	}
	
	public Cliente () {
		
	}
	
	public String getAll() {
		return
				"C�digo......: " + id + "\n" + 
				"NomeCliente...: " + nome + "\n" + 
				"Endereco....: \n" + endereco.getAll();
	}
	
	public void setAll(int id, String nome, Endereco endereco) {
		this.id = id;
		this.nome=nome;
		this.endereco=endereco;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
