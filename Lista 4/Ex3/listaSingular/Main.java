package listaSingular;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{

        //Main Exercício 3

		ListaOrdenadaGenerica<String> lista = new ListaOrdenadaGenerica<String>();


		lista.insere("a");
		lista.insere("c");
		lista.insere("b");


		lista.imprime();

	}
} 