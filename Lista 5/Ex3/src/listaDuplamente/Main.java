package listaDuplamente;
import listaSingular.ListaCircular;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		//Main exercício 3

		ListaCircular lista = new ListaCircular();
		ListaCircular listaNova = new ListaCircular();


		lista.insere(1);
		lista.insere(2);
		lista.insere(3);
		lista.insere(4);
		lista.insere(5);
		lista.insere(6);


		listaNova = lista.inverteLista();

		System.out.println("lista original");
		lista.imprime();
		System.out.println("lista invertida");
		listaNova.imprime();

	}
}