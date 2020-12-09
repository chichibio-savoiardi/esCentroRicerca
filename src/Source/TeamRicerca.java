package Source;

import java.util.*;
import java.lang.String;

public class TeamRicerca {
    private Senior senior;
    private Junior[] juniors;
    private Progetto progettoCorrente;

    public TeamRicerca(Senior senior, Junior[] juniors) {
        this.senior = senior;
        this.juniors = juniors;
    }

    public Ricercatore getSenior() {
        return senior;
    }

    public void setSenior(Senior senior) {
        this.senior = senior;
    }

    public Ricercatore[] getJuniors() {
        return juniors;
    }

    public void setJuniors(Junior[] juniors) {
        this.juniors = juniors;
    }

    public String toString() {
        return "Team Ricerca { " +
                "\nSenior = " + senior +
                "\nJuniors = " + Arrays.toString(juniors) +
                " }";
    }
}
