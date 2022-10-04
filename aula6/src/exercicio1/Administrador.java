package exercicio1;

public class Administrador extends Funcionario {

    private double horas;

    public Administrador(String nome, String rg, double salario) {
        super(nome, rg, salario);
        this.horas = 0;
    }

    public void informaHoras(double valor) {
        horas += valor;
    }

    public double calculaSalario() {
        return salario + horas * (salario / 100);
    }

    public void hollerith() {
        System.out.println("Funcionário: " + nome + "\n" + "Salário a receber: " + this.calculaSalario());
        horas = 0;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

}
