package exercicio3;

import java.util.Scanner;

public class media_arit_main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// OBJETIVO: Crie uma função que recebe três números como parâmetros e retorna a média.

// Variavéis:

        double x, y, z;

// Solicitação p/ usuário:

        System.out.println("*** Calculo de média *** \nDigite aqui 3 números que você deseja para obter a média. \nNúmero 1:");
        x = leia.nextDouble();
        System.out.println("Número 2: ");
        y = leia.nextDouble();
        System.out.println("Número 3: ");
        z = leia.nextDouble();

// Execução:

        System.out.println("A média aritmética dos números digitados é: " + Calculo_funcao.media(x, y, z));
    }
}
