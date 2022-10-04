package exercicio1;

public class Funcionario {
    protected String nome, rg;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String rg, double salario) {
        this.nome = nome;
        this.rg = rg;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
