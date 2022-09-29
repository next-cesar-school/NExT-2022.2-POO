package exercicio1;

public class Fruta {
    private int casca;
    private int caroco;

    public Fruta(int casca, int caroco) {
        this.casca = casca;
        this.caroco = caroco;
    }

    public void retiraCaroco() {
        if (this.caroco == 1) {
            this.caroco = 0;
        }
    }

    public int getCasca() {
        return casca;
    }

    public int getCaroco() {
        return caroco;
    }

}
