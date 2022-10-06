package exercicio1;

public abstract class Quadrilatero {
    public abstract float calcularArea();

    public abstract float calcularPerimetro();

    public void imprimirArea() {
        System.out.println("A area é = " + this.calcularArea());
    }
}
