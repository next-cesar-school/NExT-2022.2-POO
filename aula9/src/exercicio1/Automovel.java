package exercicio1;

public class Automovel {

    // -------------Atributos-----------------
    // isso é um atributo
    private String modelo;
    // isso é um atributo
    private Motoriasta motoriasta;
    // isso é um atributo
    private Motor motor;

    // -------------Fim-Atributos---------------------

    // -------------Contrutores----------------------
    // isso é um contrutor
    public Automovel() {
    }

    // isso é um contrutor
    public Automovel(String modelo, Motoriasta motoriasta) {
        this.modelo = modelo;
        this.motoriasta = motoriasta;// agregação vc recebe o objeto por parametro
        this.motor = new Motor(200);// composição vc cria aqui dentro
    }

    // --------------Fim-Contrutores---------------------

    // ---------------Métodos----------------------------
    // isso é um método
    @Override
    public String toString() {
        return "Modelo: " + this.modelo;
    }

    // isso é um método
    public String getModelo() {
        return modelo;
    }

    // isso é um método
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // isso é um método
    public Motoriasta getMotoriasta() {
        return motoriasta;
    }

    // isso é um método
    public void setMotoriasta(Motoriasta motoriasta) {
        this.motoriasta = motoriasta;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    // ---------------------Fim-Métodos----------------------------
}
