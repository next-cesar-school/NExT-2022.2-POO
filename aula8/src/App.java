import exercicio1.Retangulo;
import exercicio2.Divisao;
import exercicio2.Multiplicacao;
import exercicio2.OperacaoMatematica;
import exercicio2.Soma;
import exercicio2.Subtracao;
import exercicio3.Carro;
import exercicio3.Moto;

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

        Moto shineray = new Moto("123ABCD", 2, 0, false, 50, 100);

        System.out.println(shineray.toString());

        System.out.println(shineray.equals(shineray));

        Carro onix = new Carro("321DCBA", 30, 90000, true, 150, 150);

        System.out.println(onix.toString());

        onix.viajar(200);

        System.out.println(onix.toString());

    }

    public static void imprimeCalculo(OperacaoMatematica operacao, int a, int b) {
        System.out.println(operacao.calcula(a, b));
    }
}
