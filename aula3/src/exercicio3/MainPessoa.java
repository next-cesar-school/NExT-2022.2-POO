package exercicio3;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Albert Einstein";
        p1.dataNascimento = "14/03/1879";
        Pessoa p2 = new Pessoa();
        p2.nome = "Isaac Newton";
        p2.dataNascimento = "04/01/1643";
        p1.calcularIdade();
        p2.calcularIdade();
        String idadeNomeEinstein = p1.nome + ", " + p1.idade;
        String idadeNomeNewton = p2.nome + ", " + p2.idade;
        System.out.println(idadeNomeEinstein);
        System.out.println(idadeNomeNewton);
    }
}
