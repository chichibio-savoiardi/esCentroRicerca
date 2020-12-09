package Source;

import java.util.*;
import java.lang.String;

public class TeamRicerca {
    private String nomeTeam;
    private Senior senior;
    private List<Junior> juniors;
    private Progetto progettoCorrente;

    public TeamRicerca(String nomeTeam, Senior senior, List<Junior> juniors) {
        this.nomeTeam = nomeTeam;
        this.senior = senior;
        this.juniors = juniors;
        this.progettoCorrente = null;
    }

    // +++++ getter / setter +++++

    public String getNomeTeam() {
        return nomeTeam;
    }

    public void setNomeTeam(String nomeTeam) {
        this.nomeTeam = nomeTeam;
    }

    public Ricercatore getSenior() {
        return senior;
    }

    public void setSenior(Senior senior) {
        this.senior = senior;
    }

    public List<Junior> getJuniors() {
        return juniors;
    }

    public void setJuniors(List<Junior> juniors) {
        this.juniors = juniors;
    }

    public Progetto getProgettoCorrente() {
        return progettoCorrente;
    }

    public void setProgettoCorrente(Progetto progettoCorrente) {
        this.progettoCorrente = progettoCorrente;
    }

    // +++++ end getter / setter +++++

    public String toString() {
        return "Team Ricerca { " +
                "Nome team = " + nomeTeam +
                ", Progetto corrente = " + progettoCorrente +
                "\nSenior = " + senior +
                "\nJuniors = " + juniors +
                " }";
    }
}
