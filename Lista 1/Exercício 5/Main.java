import java.util.Objects;
import java.util.Scanner;

public class Main {

    //Main Exercício 5

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PilhaGenerica<Character> pilha = new PilhaGenerica<Character>(20);
        String s;
        char c;
        boolean balanceado = false;
        char topo;
        Object aux;

        String abertura = "{[(";
        String fechamento = "}])";

        System.out.println("Entre com uma frase: ");
        s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {

            if (abertura.contains(Character.toString(s.charAt(i))))
            {
                pilha.push(s.charAt(i));
            }
            else if (fechamento.contains(Character.toString(s.charAt(i))))
            {
                aux = pilha.topo(pilha);
                topo = (char) aux;
                if ((s.charAt(i) == '}' && topo == '{') || (s.charAt(i) == ']' && topo == '[') || (s.charAt(i) == ')' && topo == '('))
                {
                    balanceado = true;
                    pilha.pop();
                }
                else
                {
                    balanceado = false;
                    break;
                }
            }
        }

        if (balanceado)
            System.out.println("A sentença é balanceada!");
        else
            System.out.println("A sentenção NÃO é balanceada!");


        scanner.close();
    }
}