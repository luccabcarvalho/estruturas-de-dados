package filaCircularSimples;
import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{

		//Main exercício 2

		Fila f1 = new Fila(3);
		Fila f2 = new Fila(4);
		TesteFilaSimples filaMista = new TesteFilaSimples(6);

		f1.insere(1);
		f1.insere(2);

		f2.insere(4);
		f2.insere(5);
		f2.insere(6);
		f2.insere(7);

		filaMista.filaMista(f1, f2, filaMista);

		filaMista.imprime();


	}
}
