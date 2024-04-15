package listaDuplamente;
import listaSingular.ListaCircular;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		//Main exercício 2

		ListaCircular lista1 = new ListaCircular();
		ListaCircular lista2 = new ListaCircular();
		ListaCircular lista3 = new ListaCircular();

		lista1.insere(1);
		lista1.insere(2);
		lista1.insere(3);

		lista2.insere(4);
		lista2.insere(5);
		lista2.insere(6);


		lista3 = lista1.merge(lista2);

		lista3.imprime();

	}
}