package exercicio1;

public class TV extends Eletronico {
    private int polegada;
    private int canal;

    @Override
    public void ligar() {
        this.status = true;
        this.canal = 12;
    }
}
