package exercicio2;

import java.util.Scanner;

public class numero_primo_main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// OBJETIVO: Crie uma função chamada que receba um número inteiro como parâmetro e retorne "número primo" se o número for primo e "não é um número primo"

// Variável:

        int x;

// Solicitação p/ usuário (valor):

        System.out.println("Olá! Digite aqui o número escolhido para saber se ele é um número primo ou não: ");
        x = leia.nextInt();

// Execução:

        if ((Operacao_funcao.primo(x)) == true) {
            System.out.println("O número " + x + " é um número primo!");
        }

        else {
            System.out.println("\nO número " + x + " não é um número primo!");
        }
    }
}
