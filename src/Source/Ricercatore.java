package Source;

import java.util.Arrays;
import java.lang.String;

public class Ricercatore {
    private String[] nomeCognome = new String[2];
    private boolean senior;
    private boolean inRicerca;
    private boolean inTeam;

    public Ricercatore(String[] nomeCognome) {
        this.nomeCognome = nomeCognome;
        this.inTeam = false;
    }

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

    public String toString() {
        return "Ricercatore { " +
                "Nome e cognome = [" + nomeCognome[0] + ", " + nomeCognome[1] +
                "], Senior? = " + senior +
                ", In ricerca? = " + inRicerca +
                ", In team? = " + inTeam +
                " }";
    }
}
