import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// OBJETIVO: Crie uma função que receba o raio como parâmetro e retorne a área do círculo.

// Variáveis:

        int x;
        double p = 3.14;

// Solicitação p/ usuário (raio):

        System.out.println("Olá! Para descobrir a área do circulo desejado, insira abaixo o valor do raio: ");
        x = leia.nextInt();

// Calculo da área:

        System.out.println("\nA área do cículo de raio " + x + " é " + p * (Calculo.raio(x)) );



    }
}