package exercicio1;

public class Eletronico {
    private double consumo;
    private double voltagem;
    private boolean status;

    public void ligar() {
        this.status = true;
    }

    public void desligar() {
        this.status = false;
    }

    public boolean isLigado() {
        return this.status;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
