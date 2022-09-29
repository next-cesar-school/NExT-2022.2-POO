package exercicio3;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        // N! = 1x2x3x...xN
        // EXEMPLO: 4! = 1x2x3x4 = 24
        // 1+2+3+4 = 10
        // 1! = 1 , 0! = 1
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int n = entrada.nextInt();
        int fatorial = 1;
        if (n < 0) {
            System.out.println("Não existe fatorial de número negativo");
        } else {
            for (int i = 1; i <= n; i++) {
                fatorial = fatorial * i;
            }
            // esta construção é equivalente ao for
            // int i=1;
            // while(i <= n) {
            // fatorial = fatorial * i;
            // i++;
            // }
            System.out.println(fatorial);
        }
    }
    // referencia do acumulador de somas - calcular a soma dos numeros de zero a N
    // int acc = 0;
    // for (int i=1; i<=n; i++) {
    // acc = acc + i;
    // }

}
