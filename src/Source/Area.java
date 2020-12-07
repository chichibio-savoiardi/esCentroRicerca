package Source;

import JavaUtils.BasicUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Area {
    private Scanner areaIn;
    private Ricercatore responsabile;
    private List<TeamRicerca> teamLocali;
    private List<Ricercatore> ricercatoriLocali;
    private BasicUtils BasicUtils = new BasicUtils();

    public Area(Ricercatore responsabile) {
        areaIn = new Scanner(System.in);
        this.responsabile = responsabile;
        this.teamLocali = new ArrayList<>();
        this.ricercatoriLocali = new ArrayList<>();
        initListaRicercatori();
    }

    // +++++ getter / setter +++++

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

    // ----- end getter / setter -----

    private void initListaRicercatori() {
        Ricercatore[] tempArray = new Ricercatore[10];
        String[][] names = new String[10][2];
        names[0] = new String[]{"Mary", "Smith"};
        names[1] = new String[]{"Oliver", "Jones"};
        names[2] = new String[]{"Elizabeth", "Williams"};
        names[3] = new String[]{"William", "Taylor"};
        names[4] = new String[]{"Sarah", "Brown"};
        names[5] = new String[]{"Giuseppe", "Rossi"};
        names[6] = new String[]{"Maria", "Russo"};
        names[7] = new String[]{"Antonio", "Ferrari"};
        names[8] = new String[]{"Anna", "Esposito"};
        names[9] = new String[]{"Giovanni", "Bianchi"};
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = new Ricercatore(names[i], BasicUtils.randBool());
        }
        ricercatoriLocali.addAll(Arrays.asList(tempArray));
    }

    public void creaRicercatore() {
        //todo
    }

    public void delRicercatore() {
        //todo
    }

    public void creaTeam() {
        //todo
    }

    public void delTeam() {
        //todo
    }

    public String toString() {
        return "Area { " +
                "\nResponsabile = " + responsabile +
                "\nTeam locali = " + teamLocali +
                "\nRicercatori locali = " + ricercatoriLocali +
                "\n}\n";
    }
}
