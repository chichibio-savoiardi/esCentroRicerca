package Source;

import java.util.Arrays;
import java.util.Scanner;

public class TeamRicerca {
    private Scanner teamIn;
    private Ricercatore senior;
    private Ricercatore[] juniors;
    private Progetto progettoCorrente;

    public TeamRicerca(Ricercatore senior, Ricercatore[] juniors, Progetto progettoCorrente) {
        teamIn = new Scanner(System.in);
        this.senior = senior;
        this.juniors = juniors;
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
