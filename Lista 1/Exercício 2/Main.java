import java.util.Scanner;

public class Main {

    //Main Exercício 2

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PilhaGenerica<String> pilha = new PilhaGenerica<String>(20);
        String s;
        char c;

        System.out.println("Entre com uma frase: ");
        s = scanner.nextLine();

        int i = 0;
        while (i < s.length()) {
            c = s.charAt(i);
            pilha.push(String.valueOf(c));
            i++;
        }

        pilha.confereCadeia(pilha);


        scanner.close();
    }
}