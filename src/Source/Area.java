package Source;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Area {
    private Scanner areaIn;
    private Ricercatore responsabile;
    private List<TeamRicerca> teamLocali;
    private List<Ricercatore> ricercatoriLocali;

    public Area(Ricercatore responsabile) {
        areaIn = new Scanner(System.in);
        this.responsabile = responsabile;
        this.teamLocali = new ArrayList<>();
        this.ricercatoriLocali = new ArrayList<>();
    }

    public Ricercatore getResponsabile() {
        return responsabile;
    }

    public void setResponsabile(Ricercatore responsabile) {
        this.responsabile = responsabile;
    }

    public List<TeamRicerca> getTeamLocali() {
        return teamLocali;
    }

    public void setTeamLocali(List<TeamRicerca> teamLocali) {
        this.teamLocali = teamLocali;
    }

    public List<Ricercatore> getRicercatoriLocali() {
        return ricercatoriLocali;
    }

    public void setRicercatoriLocali(List<Ricercatore> ricercatoriLocali) {
        this.ricercatoriLocali = ricercatoriLocali;
    }
}
