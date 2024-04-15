import java.util.Objects;
import java.util.Scanner;

public class Main {

    //Main Exercício 6

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PilhaGenerica<Character> pilha = new PilhaGenerica<Character>(20);
        PilhaGenerica<Character> pilhaInvertida = new PilhaGenerica<Character>(20);
        StringBuilder inversa = new StringBuilder();

        String s;
        char c;

        System.out.println("Entre com uma frase: ");
        s = scanner.nextLine();

        int i = 0;
        while (i < s.length()) {
            c = s.charAt(i);
            pilha.push(c);
            i++;
        }


        pilha.invertePalavras(pilha, pilhaInvertida, inversa);

        scanner.close();
    }
}