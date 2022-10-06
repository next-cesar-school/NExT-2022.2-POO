package exercicio3;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto() {
    }

    public Moto(String placa, int combustivelNoTanque, int quilometragem, boolean alugado, double precoDiaria,
            int cilindradas) {
        super(placa, combustivelNoTanque, quilometragem, alugado, precoDiaria);
        this.cilindradas = cilindradas;
    }

    @Override
    public boolean viajar(int distancia) {
        int litrosGastos = (distancia / 30);
        if (litrosGastos <= this.getCombustivelNoTanque()) {
            this.setCombustivelNoTanque(this.getCombustivelNoTanque() - litrosGastos);
            this.setQuilometragem(this.getQuilometragem() + distancia);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Placa: " + this.getPlaca() +
                ", Combustivel no tanque: " + this.getCombustivelNoTanque() +
                ", Quilometragem: " + this.getQuilometragem() +
                ", alugado: " + (this.isAlugado() ? "Sim" : "Não") +
                ", Preco da diaria: " + this.getPrecoDiaria() +
                ", Cilindradas: " + this.cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

}
