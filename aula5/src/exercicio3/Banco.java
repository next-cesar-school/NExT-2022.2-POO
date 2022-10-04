package exercicio3;

public class Banco {
    private String nome;
    private String endereco;

    private Cliente[] listaCliente;

    private Transacao[] listaTransacao;

    private Calendario calendario;

    public Banco() {
    }

    public Banco(String nome, String endereco, Cliente[] listaCliente, Transacao[] listaTransacao,
            Calendario calendario) {
        this.nome = nome;
        this.endereco = endereco;
        this.listaCliente = listaCliente;
        this.listaTransacao = listaTransacao;
        this.calendario = calendario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cliente[] getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(Cliente[] listaCliente) {
        this.listaCliente = listaCliente;
    }

    public Transacao[] getListaTransacao() {
        return listaTransacao;
    }

    public void setListaTransacao(Transacao[] listaTransacao) {
        this.listaTransacao = listaTransacao;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

}
