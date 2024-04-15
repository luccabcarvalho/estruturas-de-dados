package listaSingular;

public class ListaOrdenadaGenerica<T extends Comparable<T>> extends ListaGenerica<T> {

    //Complexidade O(n)
    /* Insere elemento na lista na posição adequada, mantendo-a ordenada. */
    public void insere(T novo) {
        Elo p, q;
        Elo ant = null;

        q = new Elo(novo);

        for (p = prim; ((p != null) && (p.dado.compareTo(novo)) < 0); p = p.prox)
            ant = p;

        if (ant == null)
            prim = q;
        else
            ant.prox = q;

        q.prox = p;
    }

    //Complexidade O(n)
    /* Remove da lista o primeiro elemento com valor igual a “elem". Ret. true se removeu. */
    public boolean remove(T elem) {
        Elo p;
        Elo ant = null; /* referência para anterior */

        for (p = prim; ((p != null) && (p.dado != elem)); p = p.prox)
            ant = p;

        /* Se p é null ou p.dado != elem, então não encontrou elemento. */
        if ((p == null) || (p.dado != elem))
            return false;

        if (p == prim)
            prim = prim.prox; /* Remove elemento do início. */
        else
            ant.prox = p.prox;  /* Remove elemento do meio. */

        /* Remove a última referência para o elo a ser removido. Dessa forma,
         * o Garbage Collector irá liberar essa memória. */
        p = null;

        return true;
    }
}