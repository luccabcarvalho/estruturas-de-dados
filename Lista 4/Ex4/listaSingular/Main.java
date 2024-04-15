package listaSingular;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{

        //Main Exercício 4

		ListaGenerica<String> lista = new ListaGenerica<String>();


		lista.formaFrase("Aumentou");
		lista.formaFrase("o");
		lista.formaFrase("preco");


		lista.imprime();

	}
}