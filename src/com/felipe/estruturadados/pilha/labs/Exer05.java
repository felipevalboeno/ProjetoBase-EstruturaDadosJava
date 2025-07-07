package com.felipe.estruturadados.pilha.labs;

import java.util.Stack;

//Teste do Pal�ndromo
public class Exer05 {

	public static void main(String[] args) {
		
		imprimeResultadoPalavra("ADA");
		imprimeResultadoPalavra("ABCD");
		imprimeResultadoPalavra("Ovovo");
		
		
	}
	
	public static void imprimeResultadoPalavra(String palavra) {
		System.out.println(palavra + " � pal�ndromo? " + testaPalindromo(palavra));
		
	}
	
	public static boolean testaPalindromo(String palavra) {
		
		Stack<Character> pilha = new Stack<>();
		
		for(int i=0; i<palavra.length();i++) {
			pilha.add(palavra.charAt(i));
		
		}
		String palavraInversa = "";
		
		while(!pilha.isEmpty()) {
			palavraInversa += pilha.pop();
			
		}
		if(palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		
		}
		return false;
		
	}

}
