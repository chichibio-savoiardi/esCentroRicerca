package Source;

import java.util.*;
import java.lang.String;

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

    public Ricercatore getSenior() {
        return senior;
    }

    public void setSenior(Ricercatore senior) {
        this.senior = senior;
    }

    public Ricercatore[] getJuniors() {
        return juniors;
    }

    public void setJuniors(Ricercatore[] juniors) {
        this.juniors = juniors;
    }

    public String toString() {
        return "Team Ricerca { " +
                "\nSenior = " + senior +
                "\nJuniors = " + Arrays.toString(juniors) +
                "\nProgetto corrente = " + toStringAssistant() +
                " }";
    }

    private String toStringAssistant() {
        if (progettoCorrente == null) {
            return "empty";
        } else {
            return progettoCorrente.nome;
        }
    }
}
