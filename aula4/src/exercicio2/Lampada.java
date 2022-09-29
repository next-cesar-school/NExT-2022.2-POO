package exercicio2;

public class Lampada {
    private boolean estado;
    private int watts;

    public Lampada(boolean estado) {
        this.estado = estado;
    }

    public Lampada(int watts, boolean estado) {
        this.watts = watts;
        this.estado = estado;
    }

    public Lampada() {
        this.watts = 60;
        this.estado = false;
    }
}
