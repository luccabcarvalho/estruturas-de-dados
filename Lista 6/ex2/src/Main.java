
public class Main
{
	public static void main(String args[])
	{
		//Main ex2

		ArvBinBusca<Integer, Integer> arvoreBinaria = new ArvBinBusca<>();

		int vetor[] = new int[10];

		vetor[0] = 5;
		vetor[1] = 1;
		vetor[2] = 2;
		vetor[3] = 6;
		vetor[4] = 7;
		vetor[5] = 8;
		vetor[6] = 9;
		vetor[7] = 3;
		vetor[8] = 11;
		vetor[9] = 20;

		arvoreBinaria.constroiArvore(vetor);

		arvoreBinaria.mostra();

	}
}
