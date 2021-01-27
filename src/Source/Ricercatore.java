package Source;

import java.util.Arrays;

import lombok.Data;

import java.lang.String;

public @Data class Ricercatore {
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
}
