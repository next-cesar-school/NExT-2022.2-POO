package exercicio2;

import exercicio1.Eletronico;

public class Radio extends Eletronico {

    public static final int AM = 1;
    public static final int FM = 2;

    private double banda, sintonia;
    private int volume;

    @Override
    public void ligar() {
        super.ligar();
        this.sintonia = 88.1;
        this.volume = 10;
    }

    @Override
    public void desligar() {
        super.desligar();
        this.volume = 0;
    }
}
