package exercicio1;

public class Fruta {
    private int casca;
    private int caroco;

    public Fruta() {

    }

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

    public void setCasca(int casca) {
        this.casca = casca;
    }

    public void setCaroco(int caroco) {
        this.caroco = caroco;
    }

}
