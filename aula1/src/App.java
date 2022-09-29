import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Inicializa recurso para ler dados do teclado
        Scanner entrada = new Scanner(System.in);
        // Escreve uma mensagem no console
        System.out.print("Digite um número inteiro: ");
        // Lê um número inteiro do console e armazena o número lido em uma variável
        int x = entrada.nextInt();
        // Escreve uma mensagem no console
        System.out.print("Digite outro número inteiro: ");
        // Lê um número inteiro do console e armazena o número lido em uma variável
        int y = entrada.nextInt();
        // Fecha o objeto entrada
        entrada.close();
        // Calcula a soma dos números lidos e armazena o resultado em uma variável
        int z = x + y;
        // Escreve o valor de uma variável no console e PULA LINHA
        System.out.println(z);
        // Escreve uma mensagem no console
        System.out.print("Fim do programa!");
    }

}
