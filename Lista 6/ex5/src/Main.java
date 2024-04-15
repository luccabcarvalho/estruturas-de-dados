
public class Main
{
	public static void main(String args[])
	{

		//Método ex5

		ArvBinBusca<Integer, Integer> arvore = new ArvBinBusca<>();
		
		arvore.put(8, 1);
		arvore.put(10  , 1);
		arvore.put(5, 1);
		arvore.put(6, 1);
		arvore.put(4, 1);
		arvore.put(3, 1);


		System.out.println(arvore.obtemAncestralComum(3,6));

	}
}
