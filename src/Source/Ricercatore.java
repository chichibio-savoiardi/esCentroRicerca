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

    public String toString() {
        return "Ricercatore { " +
                "Nome e cognome=" + Arrays.toString(nomeCognome) +
                ", Senior? = " + senior +
                ", In ricerca? = " + inRicerca +
                "}\n";
    }
}
