package com.felipe.estruturadados.pilha.labs;

import com.felipe.estruturadados.pilha.Pilha;

public class Exer03 {

	public static void main(String[] args) {
		Pilha<Livro> pilha = new Pilha<Livro>(20);
		
		Livro livro1 = new Livro();
		livro1.setNome("A Torre Negra: O Pistoleiro");
		livro1.setAutor("Stephen King");
		livro1.setAnoLancamento(1982);
		livro1.setIsbn("ABC123");
		
		Livro livro2 = new Livro();
		livro2.setNome("A Torre Negra:A Escolha dos Três");
		livro2.setAutor("Stephen King");
		livro2.setAnoLancamento(1987);
		livro2.setIsbn("ABC123");
		
		Livro livro3 = new Livro();
		livro3.setNome("A Torre Negra: As Terras Devastadas");
		livro3.setAutor("Stephen King");
		livro3.setAnoLancamento(1991);
		livro3.setIsbn("ABC123");
		
		Livro livro4 = new Livro();
		livro4.setNome("A Torre Negra:  Mago e Vidro");
		livro4.setAutor("Stephen King");
		livro4.setAnoLancamento(1997);
		livro4.setIsbn("ABC123");
		
		Livro livro5 = new Livro();
		livro5.setNome("A Torre Negra:  Lobos de Calla");
		livro5.setAutor("Stephen King");
		livro5.setAnoLancamento(2003);
		livro5.setIsbn("ABC123");
		
		Livro livro6 = new Livro();
		livro6.setNome("A Torre Negra:  Canção de Susannah");
		livro6.setAutor("Stephen King");
		livro6.setAnoLancamento(2004);
		livro6.setIsbn("ABC123");
		
		Livro livro7 = new Livro();
		livro7.setNome("A Torre Negra:  A Torre Negra");
		livro7.setAutor("Stephen King");
		livro7.setAnoLancamento(2004);
		livro7.setIsbn("ABC123");
		
		System.out.println("Pilha de livros criada, pilha vazia? " + pilha.estaVazia());
		
		
		
		
		System.out.println("Empilhando livros na pilha.");
		
		pilha.empilha(livro1);
		pilha.empilha(livro2);
		pilha.empilha(livro3);
		pilha.empilha(livro4);
		pilha.empilha(livro5);
		pilha.empilha(livro6);
		pilha.empilha(livro7);
		
		System.out.println(pilha.tamanho() + " livros foram empilhados: ");
		System.out.println(pilha);
		
		
		System.out.println("Espiando livros na pilha." + pilha.topo());
		System.out.println("Pilha de livros criada, pilha vazia? " + pilha.estaVazia());
		System.out.println("Desempilhando livros da pilha: ");
		
		while(!pilha.estaVazia()) {
			System.out.println("Desempilhando livro: " + pilha.desempilha());
			
			
		}
		System.out.println("Todos os livros foram desempilhados, pilha vazia: " +  pilha.estaVazia());
		

	}

}
