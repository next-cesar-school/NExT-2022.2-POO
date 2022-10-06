package exercicio3;

public class Carro extends Veiculo {

    private double potenciaDoMotor;

    public Carro() {
    }

    public Carro(String placa, int combustivelNoTanque, int quilometragem, boolean alugado, double precoDiaria,
            double potenciaDoMotor) {
        super(placa, combustivelNoTanque, quilometragem, alugado, precoDiaria);
        this.potenciaDoMotor = potenciaDoMotor;
    }

    @Override
    public boolean viajar(int distancia) {
        int litrosGastos = (distancia / 10);
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
                ", Potencia do Motor: " + this.potenciaDoMotor;
    }

    public double getPotenciaDoMotor() {
        return potenciaDoMotor;
    }

    public void setPotenciaDoMotor(double potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }

}
