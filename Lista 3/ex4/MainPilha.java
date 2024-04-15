import java.util.Scanner;

public class MainPilha
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		PilhaGenerica<Integer> pilha = new PilhaGenerica<>(20);

		int i = 1;
		while (i <= 20)
		{
			pilha.push(i);
			i++;
		}


		System.out.println(pilha.retornaPares(pilha));
	}
}
