package beecrowd.maiorposicao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        try {
            int maior = 0;
            int posicao = 0;
            for (int i = 1; i <= 100; i++) {
                int lido = Integer.parseInt(in.readLine());
                if (maior < lido) {
                    maior = lido;
                    posicao = i;
                }
            }
            System.out.println(maior);
            System.out.println(posicao);
        } catch (Exception e) {
            System.out.println("deu erro!" + e.getMessage());
        }

    }
}
