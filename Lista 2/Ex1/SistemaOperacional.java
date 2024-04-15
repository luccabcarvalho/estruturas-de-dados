import filaCircularSimples.Fila;

public class SistemaOperacional{

    private Fila<Processo> filaProcessos;


    public SistemaOperacional(int tamanho)
    {
        filaProcessos = new Fila<Processo>(tamanho);
    }


    public boolean filaVazia()
    {
        return filaProcessos.vazia();
    }

    public boolean filaCheia()
    {
        return filaProcessos.cheia();
    }

    public boolean criaProcesso(Processo processo)
    {
        return filaProcessos.insere(processo);
    }

    public Processo removeProcesso()
    {
        return filaProcessos.remove();
    }

    public void retornaFila()
    {
        filaProcessos.retornaFila();
    }



}
