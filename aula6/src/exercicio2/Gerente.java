package exercicio2;

public class Gerente extends Funcionario {

    private String senha;
    private int numFuncionarios;

    public Gerente() {
    }

    public Gerente(String nome, String cpf, double salario, String departamento, String senha, int numFuncionarios) {
        super(nome, cpf, salario, departamento);
        this.senha = senha;
        this.numFuncionarios = numFuncionarios;
    }

    public boolean autenticarSenha(String senha) {
        return this.senha == senha;
    }

    public void bonificarGerente() {
        this.salario *= .05;
        this.bonificar();
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

}
