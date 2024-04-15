package filaCircularSimples;

import pilha.Pilha;

import java.util.Vector;

//Fila genérica criada com base na classe fila

public class FilaGenerica<T>
{
	/* Atributos protected para serem usados na subclasse. */
	protected int tamanho;	/* Tamanho do vetor */
	protected Vector<T> vetor;	/* Vetor de elementos */
	protected int ini;	/* Posicao do proximo elemento a ser retirado */
	protected int n;	/* Numero de elementos na fila */
	
	public FilaGenerica(int tam)
	{
		tamanho = tam;
		vetor = new Vector<T>(tamanho);
		ini = 0;
		n = 0;
	}
	
	public boolean vazia()
	{
		return (n == 0);
	}
	
	public boolean cheia()
	{
		return (n == tamanho);
	}
	
	//Retiramos o elemento do início da fila
	public T remove()
	{
		T elemento = null;
		
		if (!this.vazia())
		{
			elemento = vetor.get(ini);
			ini = (ini + 1) % tamanho;
			n--;
		} 

		return elemento;
	}
	
	//Inserimos o elemento no final da fila
	public boolean insere(T elemento)
	{
	  int fim;
	  
	  if ( !cheia() ) {
	    fim = (ini + n) % tamanho;
		  vetor.add(fim, elemento);
	    n++;
	    return true;
	  } 
	  else
	    return false;
	}

	//Métodos Exercício 3

	public void filaPilhas (TesteFilaSimples fila, Pilha pilha)
	{
		fila.insere(pilha);
	}

	public void filaFilas (TesteFilaSimples fila1, TesteFilaSimples fila2)
	{
		fila1.insere(fila1);
	}



}