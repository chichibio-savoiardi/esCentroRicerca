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
        this.responsabile = responsabile;
        teamLocali = new ArrayList<>();
        ricercatoriLocali = new ArrayList<>();
    }
}
