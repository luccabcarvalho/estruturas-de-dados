
public class Main
{
	public static void main(String args[])
	{

		//Método ex6

		ArvBinBusca<Integer, Integer> arvore = new ArvBinBusca<>();
		
		arvore.put(8, 1);
		arvore.put(10  , 1);
		arvore.put(5, 1);

		System.out.println(arvore.eBalanceada());
		arvore.mostra();

	}
}
