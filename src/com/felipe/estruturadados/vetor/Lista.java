package com.felipe.estruturadados.vetor;

public class Lista<T> {
	
	
	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	
	
	

//	public void adiciona(Object elemento) {
//		for (int i = 0; i < this.elementos.length; i++) {
//			if (this.elementos[i] == null) {
//				this.elementos[i] = elemento;
//				break;
//			}
//
//		}
//
//	}

//	public void adiciona(Object elemento) throws Exception{
//		if(this.tamanho < this.elementos.length) {
//		this.elementos[this.tamanho] = elemento;
//		this.tamanho++;
//		}else {
//			throw new Exception("Vetor cheio, nã é possível adicionar elementos");
//			
//		}
//	}
	
	public boolean adiciona(T elemento){
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
		this.elementos[this.tamanho] = elemento;
		this.tamanho++;
		return true;
		}else {
			return false;
		}
	}
	
	
	public boolean adiciona(int posicao, T elemento){
		if(!(posicao>=0 && posicao <tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		this.aumentaCapacidade();
		
		
		//mover todos os elementos
		for(int i=this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
			
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return false;
	}
	
//remove vetor com base na posição
	public void remove(int posicao) {
		if(!(posicao>=0 && posicao<tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for(int i=posicao; i<this.tamanho-1;i++) {
			this.elementos[i] = this.elementos[i+1];			
		}
		this.tamanho--;
		
	}
	
	
	
	public int tamanho() {
		return this.tamanho;
		
	}
	
	//busca elementos por posição do array
	public T busca(int posicao) {
		if(!(posicao>=0 && posicao<tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];		
	}
	
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos= (T[])  new Object[this.elementos.length *2];
			for(int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
				
			}
			this.elementos = elementosNovos;
		}
		
	}
	
	
	//busca sequencial dentro de um vetor, buscando a posição do array através do elemento inserido
	public int busca(T elemento) {
			for(int i = 0; i<this.tamanho;i++) {
				if(this.elementos[i].equals(elemento)) {
					return i;
					
				}
			}
			return -1;
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i =0;i<this.tamanho-1;i++) {
			s.append(this.elementos[i]);
			s.append(" , ");
			
		}
		if(this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}



	
	
}
