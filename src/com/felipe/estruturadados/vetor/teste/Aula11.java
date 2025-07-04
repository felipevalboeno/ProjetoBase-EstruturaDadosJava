package com.felipe.estruturadados.vetor.teste;

import com.felipe.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {
		Lista<String> vetor = new Lista(1);

		vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");

		System.out.println(vetor);
	}

}
