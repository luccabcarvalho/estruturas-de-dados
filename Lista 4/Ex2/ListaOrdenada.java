package listaSingular;

public class ListaOrdenada extends Lista
{
	/* Insere elemento na lista na posi��o adequada, mantendo-a ordenada. */
	public void insere(int novo)
	{
		Elo p, q;
		Elo ant = null;
		
		q = new Elo(novo);
		
		for (p = prim; ((p != null) && (p.dado < novo)); p = p.prox)
			ant = p;
		
		if (ant == null)
			prim = q;
		else
			ant.prox = q;
		
		q.prox = p;
	}

	/* Remove da lista o primeiro elemento com valor igual a �elem". Ret. true se removeu. */
	public boolean remove(int elem)
	{
		Elo p;
		Elo ant = null; /* refer�ncia para anterior */
		
		for(p = prim; ((p != null) && (p.dado < elem)); p = p.prox)
			ant = p;
		
		/* Se p � null ou p.dado != elem, ent�o n�o encontrou elemento. */
		if ((p == null) || (p.dado != elem))
			return false;
		
		if (p == prim)
			prim = prim.prox; /* Remove elemento do in�cio. */
		else
			ant.prox = p.prox;  /* Remove elemento do meio. */
		
		/* Remove a �ltima refer�ncia para o elo a ser removido. Dessa forma,
		 * o Garbage Collector ir� liberar essa mem�ria. */
		p = null;
		
		return true;
	}

	//M�todo exerc�cio 2
	//complexidade O(n)
	public ListaOrdenada intercalaListas(ListaOrdenada lista1, ListaOrdenada lista2)
	{
		ListaOrdenada listaNova = new ListaOrdenada();

		Elo p1 = lista1.prim;
		Elo p2 = lista2.prim;

		//casos base
		if (p1 == null)
			return lista2;

		if (p2 == null)
			return lista1;

		//determinar o prim
		if (p1.dado < p2.dado)
		{
			listaNova.prim = p1;
			p1 = p1.prox;
		}
		else
		{
			listaNova.prim = p2;
			p2 = p2.prox;
		}

		//ordenar a lista
		Elo pN;

		for(pN = listaNova.prim; p1 != null && p2 != null; pN = pN.prox)
		{
			if(p1.dado < p2.dado)
			{
				pN.prox = p1;
				p1 = p1.prox;
			}
			else if(p2.dado < p1.dado)
			{
				pN.prox = p2;
				p2 = p2.prox;
			}

		}

		//apontar para os elementos restantes da lista
		if (p1 != null)
			pN.prox = p1;
		else
			pN.prox = p2;


		return listaNova;

	}
}