import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Main exercício 1


        SistemaOperacional sys = new SistemaOperacional(30);

        Scanner scanner = new Scanner(System.in);

        String nomeProcesso;
        String idProcesso;

        int opc = 1;

        //menu
        System.out.printf("\nSISTEMA OPERACIONAL");

        do {
            System.out.printf("\n1)Adicionar processo. \n2)Remover processo. \n3)Exibir processos \n0)Sair.");

            System.out.printf("\nInsira a opção desejada \n>");
            opc = scanner.nextInt();

            switch (opc) {

                case 0:
                    break;

                case 1:
                    System.out.printf("\nInsira o nome do processo \n>");
                    nomeProcesso = scanner.next();

                    System.out.printf("\nInsira o número de identificação do processo \n>");
                    idProcesso = scanner.next();

                    Processo processo = new Processo(nomeProcesso, idProcesso);

                    if (sys.criaProcesso(processo))
                        System.out.printf("\nProcesso criado com sucesso!");
                    else
                        System.out.printf("\nFila de processos cheia!");

                    break;

                case 2:
                    if (!sys.filaVazia()) {
                        sys.removeProcesso();
                        System.out.printf("\nProcesso removido com sucesso!");
                    }
                    else
                        System.out.printf("\nFila de processos vazia!");

                    break;

                case 3:
                    if (sys.filaVazia())
                        System.out.printf("\nFila de processos vazia!");
                    else
                        sys.retornaFila();

                    break;
            }
        } while(opc != 0);
        

    }
}