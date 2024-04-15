import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Main Exercício 3

        PilhaGenerica<String> pilha = new PilhaGenerica<String>(20);
        PilhaGenerica<String> pilha2 = new PilhaGenerica<String>(20);
        int tamanhoPilha;
        String s;
        char c;


        System.out.println("Entre com uma frase para a primeira pilha: ");
        s = scanner.nextLine();

        int i = 0;
        while (i < s.length()) {
            c = s.charAt(i);
            pilha.push(String.valueOf(c));
            i++;
        }


        System.out.println("Entre com uma frase para a segunda pilha: ");
        s = scanner.nextLine();

        i = 0;
        while (i < s.length()) {
            c = s.charAt(i);
            pilha.push(String.valueOf(c));
            i++;
        }

        //O vetor final é criado de acordo com a soma dos tamanhos dos vetores iniciais

        int tamanho = pilha.tamanhoPilha(pilha) + pilha2.tamanhoPilha(pilha2);
        PilhaGenerica<String> pilhaFinal = new PilhaGenerica<String>(tamanho);
        PilhaGenerica<String> pilhaAux = new PilhaGenerica<String>(tamanho);
        String aux;


        i = 0;
        while (i < pilha.tamanhoPilha(pilha)) {
            aux = pilha.pop();
            pilhaAux.push(String.valueOf(aux));
            i++;
        }

        i = 0;
        while (i < pilhaAux.tamanhoPilha(pilhaAux)) {
            aux = pilhaAux.pop();
            pilhaFinal.push(String.valueOf(aux));
            i++;
        }
        
        for(i = 0; i < pilha2.tamanhoPilha(pilha2); i++) {
            aux = pilha2.pop();
            pilhaAux.push(String.valueOf(aux));
        }


        for(i = 0; i < pilhaAux.tamanhoPilha(pilhaAux); i++) {
            aux = pilhaAux.pop();
            pilhaFinal.push(String.valueOf(aux));
        }

        pilhaFinal.lerPilha(pilhaFinal);

        scanner.close();
    }
}