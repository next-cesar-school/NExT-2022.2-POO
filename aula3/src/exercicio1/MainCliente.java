package exercicio1;

public class MainCliente {

    public static void main(String[] args) {
        // Criando um objeto Cliente com cpf = 00000000111 e nome = EDUARDO
        Cliente c1 = new Cliente();
        c1.cpf = "00000000111";
        c1.nome = "EDUARDO";
        // Criando um objeto Cliente com cpf = 00000000222 e nome = CARLA
        Cliente c2 = new Cliente();
        c2.cpf = "00000000222";
        c2.nome = "CARLA";
        // Imprimindo no console os dados de c1 e de c2
        System.out.println(c1.cpf);
        System.out.println(c1.nome);
        System.out.println(c2.cpf);
        System.out.println(c2.nome);
        // Brincando um pouco com o conceito de identidade
        Cliente c3 = new Cliente();
        c3.cpf = "00000000222";
        c3.nome = "CARLA";
        // vai dar false pois são duas variáveis referenciando dois objetos diferentes
        // mas com CONTEÚDOS iguais
        System.out.println(c3 == c2);
        System.out.println(c3.cpf);
        System.out.println(c3.nome);
        Cliente c4 = c1;
        // vai dar true pois são duas variáveis referenciando o MESMO objeto
        // (criado lá na 2a linha do main()
        System.out.println(c1 == c4);
    }

}
