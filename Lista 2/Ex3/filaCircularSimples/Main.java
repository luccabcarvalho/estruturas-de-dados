package filaCircularSimples;
import pilha.Pilha;

import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{

		//Main exercício 3

		TesteFilaSimples fila1 = new TesteFilaSimples(2);
		TesteFilaSimples fila2 = new TesteFilaSimples(2);
		TesteFilaSimples fila3 = new TesteFilaSimples(4);

		fila2.insere(1);
		fila2.insere(2);

		fila3.insere(3);
		fila3.insere(4);

		fila1.filaFilas(fila1, fila2);
		fila1.filaFilas(fila1, fila3);

	}
}
