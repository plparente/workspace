package br.com.universidade.modelo;

public class Curso extends Formacao {

	private Formacao formacao;
	private String sigla;
	private String dataLancamento;
	
	public void setAll(float valor, String descricao, int duracao, Formacao formacao, String sigla, String dataLancamento) {
		this.formacao = formacao;
		this.sigla = sigla;
		this.dataLancamento = dataLancamento;
	}
	
	public String getAll() {
		return 
				super.getAll() + "\n" +
 				formacao.getAll() + "\n" + 
 				"Sigla: " + sigla + "\n" +
 				"Data Lançamento: " + dataLancamento;
	}
	
	public Curso() {
		super();
	}
	public Curso(float valor, String descricao, int duracao, Formacao formacao, String sigla, String dataLancamento) {
		super(valor, descricao, duracao);
		this.formacao = formacao;
		this.sigla = sigla;
		this.dataLancamento = dataLancamento;
	}
	public Formacao getFormacao() {
		return formacao;
	}
	public void setFormacao(Formacao formacao) {
		this.formacao = formacao;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	
}
