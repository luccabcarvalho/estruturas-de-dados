import javax.lang.model.util.ElementScanner6;
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
            if(vetor.get(i).equals(String.valueOf('A')) || vetor.get(i).equals(String.valueOf('B'))) {

                if (vetor.get(i).equals(vetor.get(topoIndex - i))) {
                    System.out.println(vetor.get(i) + "/" + vetor.get(topoIndex - i));
                    contInverso = true;
                } else {
                    contInverso = false;
                    break;
                }
            }
            else if(i == ((vetor.size() - 1) / 2) && vetor.get(i).equals(String.valueOf('C'))){
                System.out.println(vetor.get(i) + "/" + vetor.get(topoIndex - i));
                contInverso = true;
            }
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
    

}