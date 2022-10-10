package beecrowd.lesma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while (in.ready()) {
            int l = Integer.parseInt(in.readLine());
            String[] valores = in.readLine().split(" ");
            int maior = 0;
            for (int i = 0; i < l; i++) {
                if (maior < Integer.parseInt(valores[i])) {
                    maior = Integer.parseInt(valores[i]);
                }
            }
            if (maior < 10) {
                System.out.println(1);
            } else if (maior >= 10 && maior < 20) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
    }
}
