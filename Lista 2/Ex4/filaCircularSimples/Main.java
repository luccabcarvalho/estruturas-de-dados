package filaCircularSimples;
import filaCircularDupla.FilaDupla;
import filaCircularDupla.TesteFilaDupla;

import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{

		//Main exercício 4

		TesteFilaSimples fila1 = new TesteFilaSimples(5);
		TesteFilaDupla fila2 = new TesteFilaDupla(5);


		fila1.insere(1);
		fila1.insere(2);
		fila1.insere(3);

		Fila.retornaFilaDupla(fila1, fila2);

		fila2.imprime();

	}
}
