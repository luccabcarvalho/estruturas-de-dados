public class Processo {

    private String nome;
    private String identificador;

    public Processo (String n, String id)
    {
        nome = n;
        identificador = id;
    }

    public String retornaProcesso()
    {
        return (nome + " / " + identificador);
    }

}
