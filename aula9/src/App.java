import java.util.ArrayList;

import exemplo.agregacao.Jogador;
import exemplo.agregacao.Time;
import exemplo.composicao.Departamento;
import exemplo.composicao.Escola;
import exercicio1.Automovel;
import exercicio1.Motor;

public class App {
    public static void main(String[] args) throws Exception {

        Motor v3 = new Motor();

        Automovel auto = new Automovel();

        auto.getMotoriasta();

        Jogador gerson = new Jogador();
        Jogador eduardo = new Jogador();
        Jogador bruno = new Jogador();

        ArrayList<Jogador> listaJogadores = new ArrayList<>();

        listaJogadores.add(gerson);
        listaJogadores.add(eduardo);

        Time flamengo = new Time("Flamengo", listaJogadores);

        System.out.println(flamengo.jogadores.get(0).nome);

        flamengo.jogadores.add(bruno);

        flamengo = null;

        ArrayList<String> deps = new ArrayList<>();

        deps.add("D&O");
        deps.add("ADM");

        Escola cesarSchool = new Escola("CESAR SCHOOL", "RH Legal", deps);

        System.out.println(cesarSchool.rh.nome);
        System.out.println(cesarSchool.listaDepartamentos.get(0).nome);

        cesarSchool.listaDepartamentos.add(new Departamento("pedagogico"));

        cesarSchool.addDepartamento("pedagogico");

        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Gerson");
        lista.size();// retorna o tamanho da lista (quantos elementos tem dentro)

        for (String nome : lista) {
            System.out.println(nome);
        }

        String[] array = { "asa", "qweqw" };
        array[0];
        array[1];
    }
}
