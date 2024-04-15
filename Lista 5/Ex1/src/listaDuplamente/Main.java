package listaDuplamente;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		//Main exercício 1

		ListaDuplamente lista = new ListaDuplamente();
		ListaDuplamente lista2 = new ListaDuplamente();
		ListaDuplamente lista3 = new ListaDuplamente();

		lista.insere(1);
		lista.insere(2);
        lista.insere(3);
        lista.insere(4);

		lista2.insere(4);
		lista2.insere(3);
		lista2.insere(5);
        lista2.insere(2);
        lista2.insere(7);

		lista3 = lista.intersecaoListas(lista2);

		lista3.imprime();

	}
}