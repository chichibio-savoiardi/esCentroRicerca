package Source;

import java.lang.String;
import java.util.Arrays;

public class Progetto {
    protected TeamRicerca assegnatoA;
    protected String nome;

    public Progetto(String nome, TeamRicerca assegnatoA) {
        this.assegnatoA = assegnatoA;
        this.nome = nome;
    }

    public String toString() {
        return "Progetto { " +
                "nome = '" + nome +
                ", assegnato A = " + assegnatoA +
                " }";
    }
}
