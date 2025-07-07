package com.felipe.estruturadados.pilha.teste;

import com.felipe.estruturadados.pilha.Pilha;

public class Aula14 {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		for(int i=1; i<=10; i++) {
			pilha.empilha(i);
			
			
		}
		
		//Imprimindo a pilha
		System.out.println("Pilha completa: " +  pilha);
		System.out.println("O tamanho da pilha �: " + pilha.tamanho());
		
		System.out.println("A pilha est� vazia? " + pilha.estaVazia());
		
		
		System.out.println("Qual valor est� no topo da pilha? " + pilha.topo());
		
		//retirando um item da pilha
		System.out.println("Desempilhando o �ltimo valor: " + pilha.desempilha());
		
		System.out.println("Qual valor est� no topo da pilha? " + pilha.topo());
		System.out.println("Pilha completa: " +  pilha);

	}
	

}
