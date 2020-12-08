package Source;

import java.io.ObjectOutput;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.lang.*;

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
                "\nJuniors = " + juniors +
                "\nProgetto corrente = " + progettoCorrente +
                " }";
    }

    /*private String toString(Ricercatore[] arr) {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (Ricercatore a : arr) {
            result.append(a);
        }
        result.append("]");
        return result.toString();
    }*/
}
