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
        String[] tempNomeCognome = new String[2];
        System.out.println("Inserisci il nome del ricercatore");
        tempNomeCognome[0] = areaIn.nextLine();
        System.out.println("Inserisci il cognome del ricercatore");
        tempNomeCognome[1] = areaIn.nextLine();
        System.out.println("E' un ricercatore senior? S/N");
        String temp = areaIn.nextLine();
        boolean tempSenior = false;
        if (temp.equals("s") || temp.equals("S")) {
            tempSenior = true;
        }
        try {
            ricercatoriLocali.add(new Ricercatore(tempNomeCognome, tempSenior));
        } catch (Exception e) {
            System.out.println("Error\nValore invalido in creaRicercatore() " + getClass());
            return;
        }
    }

    public void delRicercatore() {
        if (ricercatoriLocali.isEmpty()) {
            System.out.println("Non ci sono ricercatori nell'area");
            return;
        }
        System.out.println(ricercatoriLocali.toString());
        System.out.println("Scegli l'indice del ricercatore da eliminare");
        try {
            ricercatoriLocali.remove(areaIn.nextInt());
        } catch (Exception e) {
            System.out.println("Error\nValore invalido in delRicercatore() " + getClass());
            return;
        }
    }

    public void creaTeam() {
        for (int i = 0; i < ricercatoriLocali.size(); i++) {
            if (ricercatoriLocali.get(i).isSenior()) System.out.print(i + ": " + ricercatoriLocali.get(i).toString());
        }
        System.out.println("Scegli l'indice di un ricercatore senior come capo del team");
        int tempSenior = areaIn.nextInt();
        System.out.println();
        for (int i = 0; i < ricercatoriLocali.size(); i++) {
            if (!ricercatoriLocali.get(i).isInTeam()) System.out.print(i + ": " + ricercatoriLocali.get(i).toString());
        }
        String temp = "n";
        int indexRicercatore = 0;
        List<Ricercatore> tempList = new ArrayList<>();
        do {
            System.out.println("Inserisci l'indice di un ricercatore per il team");
            indexRicercatore = areaIn.nextInt();
            if (!tempList.get(indexRicercatore).inTeam) {
                tempList.add(ricercatoriLocali.get(indexRicercatore));
                System.out.println("Vuoi inserire un'altro ricercatore? S/N?");
                temp = areaIn.nextLine();
            } else {
                //todo
            }
        } while (temp.equals("s") || temp.equals("S"));
        System.out.println(ricercatoriLocali);
        try {
            teamLocali.add(new TeamRicerca(ricercatoriLocali.get(tempSenior), (Ricercatore[]) tempList.toArray()));
        } catch (Exception e) {
            System.out.println("Error\nValore invalido in creaTeam() " + getClass());
            return;
        }
    }

    public void delTeam() {
        //todo
    }

    public String toString() {
        return "Area { " +
                "\nResponsabile = " + responsabile +
                "Team locali = " + teamLocali +
                "\nRicercatori locali = \n" + ricercatoriLocali +
                "\n}\n";
    }
}
