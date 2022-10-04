package exercicio2;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    protected String departamento;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, double salario, String departamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void bonificar() {
        this.salario *= .1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
