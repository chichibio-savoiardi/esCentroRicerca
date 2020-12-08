package Source;

import JavaUtils.ArrayUtils;

import java.util.Arrays;

public class Ricercatore {
    protected String[] nomeCognome = new String[2];
    protected boolean senior;
    protected boolean inRicerca;
    protected boolean inTeam;
    private static ArrayUtils arrayUtils = new ArrayUtils();

    public Ricercatore(String[] nomeCognome, boolean senior) {
        this.nomeCognome = nomeCognome;
        this.senior = senior;
        this.inTeam = false;
    }

    public String[] getNomeCognome() {
        return nomeCognome;
    }

    public void setNomeCognome(String[] nomeCognome) {
        this.nomeCognome = nomeCognome;
    }

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
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
