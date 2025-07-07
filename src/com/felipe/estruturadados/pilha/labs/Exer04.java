package com.felipe.estruturadados.pilha.labs;

import java.util.Stack;

public class Exer04 {

	public static void main(String[] args) {
		Stack<Livro> pilha = new Stack<Livro>();

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

		System.out.println("Pilha de livros criada, pilha vazia? " + pilha.isEmpty());




		System.out.println("Empilhando livros na pilha.");

		pilha.add(livro1);
		pilha.add(livro2);
		pilha.add(livro3);
		pilha.add(livro4);
		pilha.add(livro5);
		pilha.add(livro6);
		pilha.add(livro7);

		System.out.println(pilha.size() + " livros foram empilhados: ");
		System.out.println(pilha);


		System.out.println("Espiando livros na pilha." + pilha.peek());
		System.out.println("Pilha de livros criada, pilha vazia? " + pilha.isEmpty());
		System.out.println("Desempilhando livros da pilha: ");

		while(!pilha.isEmpty()) {
			System.out.println("Desempilhando livro: " + pilha.pop());


		}
		System.out.println("Todos os livros foram desempilhados, pilha vazia: " +  pilha.isEmpty());


	}

}
