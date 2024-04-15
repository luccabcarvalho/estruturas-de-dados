import java.util.Objects;
import java.util.Scanner;

public class Main {

    //Main Exercício 4

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PilhaGenerica<String> pilha = new PilhaGenerica<String>(20);
        PilhaGenerica<String> pilhaAux = new PilhaGenerica<String>(20);
        String s;
        char cAux;
        String c;
        String p;

        System.out.println("Entre com uma frase: ");
        s = scanner.nextLine();

        int i = 0;
        while (i < s.length()) {
            cAux = s.charAt(i);
            pilha.push(String.valueOf(cAux));
            i++;
        }

        System.out.println("Qual a posição que deseja retirar?: ");
        p = scanner.next();



        for (i = 0; i < (pilha.tamanhoPilha4(pilha)); i++)
        {
            c = pilha.pop();
            System.out.println(c);
            if (!c.equals(p))
                pilhaAux.push(c);
        }

        for (i = 0; i < pilhaAux.tamanhoPilha4(pilhaAux); i++)
        {;
            System.out.print(pilhaAux.pop());
        }


        scanner.close();
    }
}