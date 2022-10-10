package exemplo.agregacao;

import java.util.List;

public class Time {
    public String nome;
    public List<Jogador> jogadores;

    public Time(String nome, List<Jogador> jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

}
