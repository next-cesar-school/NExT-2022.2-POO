import exercicio1.Retangulo;
import exercicio2.Divisao;
import exercicio2.Multiplicacao;
import exercicio2.OperacaoMatematica;
import exercicio2.Soma;
import exercicio2.Subtracao;

public class App {
    public static void main(String[] args) throws Exception {

        Retangulo ret1 = new Retangulo(4.0f, 2.0f);

        ret1.imprimirArea();

        Soma sun = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao mult = new Multiplicacao();
        Divisao div = new Divisao();

        imprimeCalculo(sun, 2, 5);
        imprimeCalculo(sub, 2, 5);
        imprimeCalculo(mult, 2, 5);
        imprimeCalculo(div, 2, 5);

    }

    public static void imprimeCalculo(OperacaoMatematica operacao, int a, int b) {
        System.out.println(operacao.calcula(a, b));
    }
}
