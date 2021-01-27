package Source;

import java.util.*;

import lombok.Data;

import java.lang.String;

public @Data class TeamRicerca {
    private String nomeTeam;
    private Senior senior;
    private List<Junior> juniors;
    private Progetto progettoCorrente;

    public TeamRicerca(String nomeTeam, Senior senior, List<Junior> juniors) {
        this.nomeTeam = nomeTeam;
        this.senior = senior;
        this.juniors = juniors;
        this.progettoCorrente = null;
    }
}
