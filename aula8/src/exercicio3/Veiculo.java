package exercicio3;

public abstract class Veiculo {
    private String placa;
    private int combustivelNoTanque;
    private int quilometragem;
    private boolean alugado;
    private double precoDiaria;

    public Veiculo() {
    }

    public Veiculo(String placa, int combustivelNoTanque, int quilometragem, boolean alugado, double precoDiaria) {
        this.placa = placa;
        this.combustivelNoTanque = combustivelNoTanque;
        this.quilometragem = quilometragem;
        this.alugado = alugado;
        this.precoDiaria = precoDiaria;
    }

    public void abastecer(int combustivel) {
        this.combustivelNoTanque = combustivel;
    }

    public abstract boolean viajar(int distancia);

    @Override
    public String toString() {
        return "Placa: " + this.placa +
                ", Combustivel no tanque: " + this.combustivelNoTanque +
                ", Quilometragem: " + this.quilometragem +
                ", alugado: " + (this.alugado ? "Sim" : "Não") +
                ", Preco da diaria: " + this.precoDiaria;
    }

    @Override
    public boolean equals(Object obj) {
        Veiculo aux = (Veiculo) obj;
        if (this.placa == aux.placa)
            return true;
        return false;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCombustivelNoTanque() {
        return combustivelNoTanque;
    }

    public void setCombustivelNoTanque(int combustivelNoTanque) {
        this.combustivelNoTanque = combustivelNoTanque;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

}
