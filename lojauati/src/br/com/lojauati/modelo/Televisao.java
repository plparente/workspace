package br.com.lojauati.modelo;

public class Televisao {

	private int canal;
	private boolean status;
	private int volume;
	
	
	public void aumentarVolume() {
		volume++;
	}
	
	public void diminuirVolume() {
		if (volume>0 && status==true) {
		volume--;
	}
	}
		
	public void desligar() {
		status=false;
			}
	
	public void ligar() {
		status=true;
			}

	public void mudarCanal(int tCanal) {
		if (status==true) {
			canal=tCanal;
		}
			}
	
	public boolean exibirStatus() {
		return status;
			}
	
	public String exibirTudo() {
		String resposta="DESLIGADA";
		if (status==true) {
			resposta="LIGADA";
		}
		return 
				"status:  " + resposta + "\n" +
				"Canal:  " + canal + "\n" +
				"Volume: " + volume;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


