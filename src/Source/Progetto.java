package Source;

import java.lang.String;
import java.util.Arrays;

public class Progetto {
    private TeamRicerca assegnatoA;
    private String nome;
    private String tipo;
    private double budget;

    public Progetto(String nome, String tipo, double budget, TeamRicerca assegnatoA) {
        this.assegnatoA = assegnatoA;
        this.nome = nome;
        this.tipo = tipo;
        this.budget = budget;
    }

    public String toString() {
        return "Progetto { " +
                "nome = '" + nome +
                ", assegnato A = " + assegnatoA +
                " }";
    }
}
