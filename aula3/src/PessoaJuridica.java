class PessoaJuridica {
    // variavel global
    String nome;// this
    String cnpj;// this
    int idade;// this

    String getNome() {
        return this.nome;
    }

    String getCnpj() {
        return cnpj;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    /// variavel local
    void setIdade(int idade) {
        this.idade = idade;
    }

    void fazCoisa(double a) {
        System.out.println("ta fazendo coisa!" + a);
    }
}
