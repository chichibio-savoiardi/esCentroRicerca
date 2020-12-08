package Source;

import java.util.Arrays;

public class Ricercatore {
    protected String[] nomeCognome = new String[2];
    protected boolean senior;
    protected boolean inRicerca;

    public Ricercatore(String[] nomeCognome, boolean senior) {
        this.nomeCognome = nomeCognome;
        this.senior = senior;
        this.inRicerca = false;
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

    public boolean isInRicerca() {
        return inRicerca;
    }

    public void setInRicerca(boolean inRicerca) {
        this.inRicerca = inRicerca;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }

    public String toString() {
        return "Ricercatore { " +
                "Nome e cognome = " + Arrays.toString(nomeCognome) +
                ", Senior? = " + senior +
                ", In ricerca? = " + inRicerca +
                "}\n";
    }
}
