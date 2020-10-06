package br.com.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		/*
		 * Collection Framework = uma API para armazenar multiplos dados
		 */
		//String x[] = new String [2];
		
		// Collection com Generics
		List<String> lista = new ArrayList<String>();
		lista.add("DBA");
		lista.add("DEV");
		lista.add("DBA");
		lista.add("ANALISTA");
		lista.add("ESTAGIARIO");
		System.out.println(lista);
		System.out.println("Segundo elemento da Lista: " + lista.get(1));
		lista.remove(2);
		System.out.println("Lista ap�s eliminar o terceiro elemento: " + lista);
		Collections.sort(lista);
		
		/*
		 * For convencional, � formado por 3 parametros:
		 * - inicio do contador 
		 * - a condi��o para terminar a contagem
		 * - incremento
		 */
		
		//for(int contador=0;contador<lista.size();contador++) {
		//	System.out.println("Cargo: " + lista.get(contador));
		//}
		
		System.out.println(lista);
		
		/*
		 * For each, , � formado por 2 parametros
		 * - tipo de dado armazenado
		 * - onde est�o os dados 
		 */
		
		for (String cargo : lista) {
			System.out.println("Cargo: " + cargo);	
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
