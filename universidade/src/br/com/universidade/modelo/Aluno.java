package br.com.universidade.modelo;

/*
 * Design Patterns (Melhores pr�ticas para projetos com 00)
 * DTO (Data Transfer Object) => melhores pr�ticas para os modelos (Beans / JavaBeans / TO / model)
 * 1� Sugest�o: TODOS os atributos devem ser privados
 * 2� Sugest�o: Cada atributo deve ter o seu m�todo getter (output) e setter (input) 
 * 3� Sugest�o:
 */

public class Aluno {

	private int numeroMatricula;
	private String nome;
	private String email;
	private Endereco endereco;
	
	public String getAll() {
		return
				"Matricula....: " + numeroMatricula + "\n" + 
				"Nome.........: " + nome + "\n" +
				"Email........: " + email + "\n" +
				"Endereco.....: " + endereco.getAll();
	}
	
	public void setAll(int p1, String p2, String p3, Endereco p4) {
		numeroMatricula=p1;
		nome=p2;
		email=p3;
		endereco=p4;
	}
	
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
