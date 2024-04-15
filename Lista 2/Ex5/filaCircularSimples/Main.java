package filaCircularSimples;


import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{

		//Main exercício 5

		Scanner scanner = new Scanner(System.in);
		int num;

		System.out.printf("\nInsira o valor desejado \n> ");
		num = scanner.nextInt();

		TesteFilaSimples fila = new TesteFilaSimples(num);

		for(int i = 1; i <= num; i++)
		{
			fila.insere(fila.conversaoBinaria(i,fila));
		}

		fila.imprime();
	}
}
