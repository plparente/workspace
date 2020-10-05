package br.com.lojauati.modelo;

public class Formula1 {
	
	// Sintaxe para cria��o de m�todos no Java
		// <modificador> <tipo do retorno> <nome do metodo> (<tipo do param> <nome do param>){...}
	
	private String escuderia;
	private float valor;
	private int rpm;
	
	
	// crie um metodo para preencher todos os atributos - preencherTudo()
	// Crie um m�todo para exibir todos os atributos - exibirTudo()
	// Crie um m�todo para exibir o valor com um desconto de 10% - exibirPromocao()
	// Crie um m�todo para exibir o valor com um desconto que ser� recebido por par�metro - exibirPromocao()
	
	public float exibirPromocao(float porc) {
		return valor - valor * (porc/100);
	}
	
	public float exibirPromocao() {
		return valor * (float) 0.9;
	}
	
	public String exibirTudo() {
		return escuderia + "\n" + valor + "\n" + rpm;
	}
	
	public void preencherTudo(String p1, float p2, int p3) {
		escuderia=p1;
		valor=p2;
		rpm=p3;
		
	}
	
	
	
	// criem os metodos para preencher o rpm e o valor e os metodos para exibir rpm e o valor

	public int exibirRpm() {
		return rpm;
	}
	
	public float exibirValor() {
		return valor;
	}
	
	public void preencherValor(float parametro) {
		if (parametro>0) {
		valor = parametro;
	}
	}
	
	public void preencherRpm(int parametro) {
		rpm=parametro;
	}
	
	public String exibirEscuderia() {
		return escuderia;
	}
	
	public void preencherEscuderia(String parametro) {
		escuderia = parametro.toUpperCase();
	}
	
	
}
