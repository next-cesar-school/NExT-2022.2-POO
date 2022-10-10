package exemplo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    public String nome;
    public RecursosHumanos rh;
    public List<Departamento> listaDepartamentos;

    public Escola(String nome, String nomeRH, List<String> departamentos) {
        this.nome = nome;
        this.listaDepartamentos = new ArrayList<Departamento>();
        this.rh = new RecursosHumanos(nomeRH);
        for (String nomeDepartamento : departamentos) {
            Departamento dep = new Departamento(nomeDepartamento);
            listaDepartamentos.add(dep);
        }
    }

    public void addDepartamento(String nomeDepartamento) {
        Departamento depTemp = new Departamento(nomeDepartamento);
        this.listaDepartamentos.add(depTemp);
    }
}
