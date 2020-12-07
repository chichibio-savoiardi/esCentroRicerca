package Source;

import java.util.Arrays;
import java.util.Scanner;

public class TeamRicerca {
    private Ricercatore senior;
    private Ricercatore[] juniors;
    private Progetto progettoCorrente;

    public TeamRicerca(Ricercatore senior, Ricercatore[] juniors) {
        this.senior = senior;
        this.juniors = juniors;
        this.progettoCorrente = null;
    }

    public Progetto getProgettoCorrente() {
        return progettoCorrente;
    }

    public void setProgettoCorrente(Progetto progettoCorrente) {
        this.progettoCorrente = progettoCorrente;
    }

    public String toString() {
        return "Team Ricerca { " +
                "\nSenior = " + senior +
                "\nJuniors = " + Arrays.toString(juniors) +
                "\nProgetto corrente = " + progettoCorrente +
                "\n}\n";
    }
}
