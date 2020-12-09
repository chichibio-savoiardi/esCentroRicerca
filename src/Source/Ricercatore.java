package Source;

import java.util.Arrays;
import java.lang.String;

public class Ricercatore {
    private String[] nomeCognome = new String[2];
    private boolean inTeam;

    public Ricercatore(String[] nomeCognome) {
        this.nomeCognome = nomeCognome;
        this.inTeam = false;
    }

    public Ricercatore(Responsabile responsabile) {
        this.nomeCognome = responsabile.getNomeCognome();
        this.inTeam = responsabile.isInTeam();
    }

    public Ricercatore(Senior senior) {
        this.nomeCognome = senior.getNomeCognome();
        this.inTeam = senior.isInTeam();
    }

    public Ricercatore(Junior junior) {
        this.nomeCognome = junior.getNomeCognome();
        this.inTeam = junior.isInTeam();
    }

    // +++++ getter / setter +++++

    public String[] getNomeCognome() {
        return nomeCognome;
    }

    public void setNomeCognome(String[] nomeCognome) {
        this.nomeCognome = nomeCognome;
    }

    public boolean isInTeam() {
        return inTeam;
    }

    public void setInTeam(boolean inTeam) {
        this.inTeam = inTeam;
    }

    // +++++ end getter / setter +++++

    public String toString() {
        return "Ricercatore { " +
                "Nome e cognome = " + Arrays.toString(nomeCognome) +
                ", In team = " + inTeam +
                " }";
    }
}
