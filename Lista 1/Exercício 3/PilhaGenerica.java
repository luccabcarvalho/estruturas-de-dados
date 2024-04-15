import java.util.Vector;

public class PilhaGenerica<T>
{
    private int n;
    private Vector<T> vetor;
    private int topo;

    public PilhaGenerica(int tamanho)
    {
        n = tamanho;
        vetor = new Vector<T>(tamanho);
        topo = -1;
    }

    public boolean vazia()
    {
        return topo == -1 ? true : false;
    }

    public boolean cheia()
    {
        return topo == n - 1 ? true : false;
    }

    public T pop()
    {
        T elemento;

        if (!this.vazia())
        {
            elemento = vetor.get(topo--);
            return elemento;
        }
        else
        {
            //Impress�o para fins did�ticos
            System.out.println("Pilha vazia: pop nao funcionou.");
            return null;
        }
    }

    public boolean push(T elemento)
    {
        if (!this.cheia())
        {
            vetor.add(++topo, elemento);
            return true;
        }
        else
        {
            //Impress�o para fins did�ticos
            System.out.println("Pilha cheia: push nao funcionou.\n");
            return false;
        }
    }

    public boolean retornaTopo(T elemento)
    {
        if(!this.vazia()){
            elemento = vetor.get(topo);
            return true;
        }
        else
            return false;
    }

    //Método Exercício 1

    public void confereInversa()
    {
        boolean contInverso = true;
        int topoIndex = vetor.size() - 1;

        for(int i = 0; i <= (vetor.size() - 1); i++)
        {
            if(vetor.get(i).equals(vetor.get(topoIndex - i)))
                contInverso = true;
            else {
                contInverso = false;
                break;
            }
        }

        if(contInverso)
            System.out.println("Formato correto!");
        else
            System.out.println("Formato incorreto!");

    }

    //Métodos Exercício 3

    public int tamanhoPilha(PilhaGenerica pilha)
    {
        return pilha.vetor.size();
    }

    public void lerPilha(PilhaGenerica pilha)
    {
        for(int i = 0; i < pilha.vetor.size(); i++)
        {
            System.out.print(pilha.vetor.get(i));
        }
    }







    //Exercício 6

    public void retornaInversa(PilhaGenerica pilha)
    {
        Object c;
        while(!this.vazia())
        {
            c = pilha.pop();
            System.out.print(c);
        }
    }

}