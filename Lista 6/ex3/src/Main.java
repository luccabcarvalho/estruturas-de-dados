
public class Main
{
	public static void main(String args[])
	{

		//Método ex3

		ArvBinBusca<Integer, Integer> arvore = new ArvBinBusca<>();
		ArvBinBusca<Integer, Integer> arvore2 = new ArvBinBusca<>();
		
		arvore.put(8, 1);
		arvore.put(10  , 1);
		arvore.put(5, 1);
		arvore.put(6, 1);
		arvore.put(4, 1);
		arvore.put(3, 1);

		arvore2.put(8, 1);
		arvore2.put(10  , 1);
		arvore2.put(5, 1);
		arvore2.put(6, 1);
		arvore2.put(4, 1);
		arvore2.put(3, 1);


		System.out.println(arvore.eSimilar(arvore2));

	}
}
