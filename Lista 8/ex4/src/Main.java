
public class Main
{
	public static void main(String args[]) {
		int tamanho = 6;
		int vetor[] = {1, 5, 6, 3, 7, 2};

		HeapBinariaMinima heap = new HeapBinariaMinima(tamanho, vetor);


		vetor = new int[]{10, 6, 3, 1, 5, 7};

		HeapBinariaMaxima heapMaxima = new HeapBinariaMaxima(tamanho, vetor);

		System.out.println("Heaps iniciais:\n");

		System.out.println("heap minima:");
		heap.imprime();

		System.out.println("heap maxima:");
		heapMaxima.imprime();


		//ex 2 e 3

		HeapBinariaMinima newHeap = new HeapBinariaMinima(heapMaxima);

		HeapBinariaMaxima newHeapMaxima = new HeapBinariaMaxima(heap);

		System.out.println("\nExercícios 2 e 3:");
		System.out.println("heap minima:");
		newHeap.imprime();

		System.out.println("heap maxima:");
		newHeapMaxima.imprime();


		//ex 4

		int vetorTrue[] = {50, 40, 30, 10, 12, 20, 11};
		int vetorFalse[] = {50, 40, 30, 10, 80, 20, 11};

		System.out.println("\nExercício 4:");
		System.out.println(heapMaxima.verificaPropriedadeHeap(vetorTrue));
		System.out.println(heapMaxima.verificaPropriedadeHeap(vetorFalse));

		//ex5

		System.out.println("\nExercício 5:");
		System.out.println(newHeapMaxima.remove(2));

		System.out.println("\nNova Heap:");
		newHeapMaxima.imprime();

	}
}