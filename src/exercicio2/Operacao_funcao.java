package exercicio2;

public class Operacao_funcao {

    public static boolean primo (int x) {
            if (x <= 1) {
                return false;
            }

        for(int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;

    }



}
