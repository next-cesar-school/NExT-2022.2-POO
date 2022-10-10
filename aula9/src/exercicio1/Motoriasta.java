package exercicio1;

public class Motoriasta {

    private String nome;
    private int habilitacao;

    public Motoriasta() {
    }

    public Motoriasta(String nome, int habilitacao) {
        this.nome = nome;
        this.habilitacao = habilitacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(int habilitacao) {
        this.habilitacao = habilitacao;
    }

}
