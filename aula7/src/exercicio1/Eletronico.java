package exercicio1;

public class Eletronico {
    protected double consumo;
    protected double voltagem;
    protected boolean status;

    public void ligar() {
        this.status = true;
    }

    public void desligar() {
        this.status = false;
    }

    public boolean isLigado() {
        return this.status;
    }
}
