import exercicio1.Fruta;
import exercicio2.Lampada;
import exercicio3.Produto;

public class App {
    public static void main(String[] args) throws Exception {

        Fruta objeto1 = new Fruta(1, 1);
        Fruta objeto2 = new Fruta(1, 0);

        Lampada lamp1 = new Lampada();
        Lampada lamp2 = new Lampada(true);
        Lampada lamp3 = new Lampada(90, true);

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.setDescricao("Maçã");
        p1.setValor(4.30);
        p1.setEstoque(55700);

        p2.setDescricao("Arroz");
        p2.setValor(2.30);
        p2.setEstoque(78);

        System.out.println(
                "Descição: " + p1.getDescricao() + ", Valor: " + p1.getValor() + ", Estoque: " + p1.getEstoque());
        System.out.println(
                "Descição: " + p2.getDescricao() + ", Valor: " + p2.getValor() + ", Estoque: " + p2.getEstoque());

    }
}
