package listaSingular;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{

        //Main Exercício 5

		ListaGenerica<Character> lista = new ListaGenerica<Character>();
		String frase = "Aumentou o preco";

		for(int i = 0; i < frase.length(); i++)
			lista.formaFrase(frase.charAt(i));

		lista.inverterFrase();

		lista.imprime();

	}
}