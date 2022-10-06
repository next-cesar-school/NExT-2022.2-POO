package exercicio1;

public class TV extends Eletronico {
    private int polegada;
    private int canal;

    @Override
    public void ligar() {
        this.setStatus(true);
        this.canal = 12;
    }

    public int getPolegada() {
        return polegada;
    }

    public void setPolegada(int polegada) {
        this.polegada = polegada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal > 0 && canal < 100) {
            this.canal = canal;
        }
    }

}
