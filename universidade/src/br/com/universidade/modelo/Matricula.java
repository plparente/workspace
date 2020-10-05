package br.com.universidade.modelo;

public class Matricula {

	private int numeroMatricula;
	private String nome;
	private String email;
	
	
	public void preencherMatricula(int nMatricula) {
		numeroMatricula=nMatricula;
	}
	
	public void preencherNome(String pNome) {
		nome=pNome;
	}
	
	public void preencherEmail(String pEmail) {
		email=pEmail;
	}
	
	public String exibirNome() {
		return 
				"Nome: " + nome;
	}
	
		public String exibirEmail() {
			return 
					"Email: " + email;
		}
		
		public int exibirMatricula() {
			return 
					numeroMatricula;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
