package Source;

public class Ricercatore {
    protected String[] nomeCognome = new String[2];
    protected boolean senior;
    protected boolean inRicerca;

    public Ricercatore(String[] nomeCognome, boolean senior) {
        this.nomeCognome = nomeCognome;
        this.senior = senior;
        this.inRicerca = false;
    }
}
