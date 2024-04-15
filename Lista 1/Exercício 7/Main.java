import java.util.Objects;
import java.util.Scanner;

public class Main {

    //Main Exercício 7

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PilhaGenerica<Character> pilha = new PilhaGenerica<Character>(20);
        PilhaGenerica<Character> pilhaOperacoes = new PilhaGenerica<Character>(40);

        String s;
        char c;
        int posAbertura = 0;
        int posFechamento = 0;

        Object aux;
        Character aux2;
        float operando1 = 0;
        float operando2 = 0;
        char operador = ' ';
        float result;


        System.out.println("Entre com uma frase: ");
        s = scanner.nextLine();


        while (s.contains(Character.toString('(')) || s.contains(Character.toString(')'))) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    posAbertura = i;
                } else if (s.charAt(i) == ')') {
                    posFechamento = i;

                    int k = (posAbertura + 1);
                    while (k < posFechamento) {
                        pilhaOperacoes.push(s.charAt(k));
                        k++;
                    }

                    s = s.substring(0, posAbertura) + pilhaOperacoes.conta(pilhaOperacoes) + s.substring(posFechamento + 1, s.length());
                    System.out.println(s);
                }
            }
        }

        System.out.println(s);

        scanner.close();
    }
}