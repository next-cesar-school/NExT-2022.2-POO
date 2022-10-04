package exercicio1;

public class Vendedor extends Funcionario {

    private double vendas;

    public Vendedor(String nome, String rg, double salario) {
        super(nome, rg, salario);
        this.vendas = 0;
    }

    public void informaVendas(double valor) {
        vendas += valor;
    }

    public double calculaSalario() {
        return salario + vendas * 0.05;
    }

    public void hollerith() {
        System.out.println("Funcionário: " + nome + "\n" + "Salário a receber: " + this.calculaSalario());
        vendas = 0;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

}
