package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

public class Bacharelado extends Formacao implements PadraoFormacao {

	private String projetoConclusao;
	private String cargaHorariaEstagio;
	
	
	public void setAll(float valor, String descricao, int duracao, String projetoConclusao,
			String cargaHorariaEstagio) {
		super.setAll(valor, descricao, duracao);
		
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
		
	
	
	public String getAll() {
		return 
				super.getAll() + "\n" +
 				"Projeto Conclus�o: " + projetoConclusao + "\n" + 
				"Carga Hor�ria Est�gio: " + cargaHorariaEstagio; 
	}
	
	
		public Bacharelado() {
		super();
	}
		
		
	public Bacharelado(float valor, String descricao, int duracao, String projetoConclusao,
			String cargaHorariaEstagio) {
		super(valor, descricao, duracao);
		
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public String getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(String cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}




	@Override
	public double calcularMensalidade(float fator) {
		return getValor()/48 * fator;
	}

	@Override
	public void definirDuracao() {
		setDuracao(48);
		
	}
	
	
	
}
