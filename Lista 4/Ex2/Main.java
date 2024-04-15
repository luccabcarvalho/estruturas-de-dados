package listaSingular;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{

        //Main Exercício 2

		ListaOrdenada lista1 = new ListaOrdenada();
		ListaOrdenada lista2 = new ListaOrdenada();
		ListaOrdenada listaNova = new ListaOrdenada();

		lista1.insere(1);
		lista1.insere(3);
		lista1.insere(5);

		lista2.insere(4);
		lista2.insere(6);
		lista2.insere(8);

		listaNova = lista1.intercalaListas(lista1, lista2);

		listaNova.imprime();

	}
}