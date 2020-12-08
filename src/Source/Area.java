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
        areaIn = new Scanner(System.in);
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
        System.out.println("Ricercatore creato:\n" + ricercatoriLocali.get(ricercatoriLocali.size() - 1));
    }

    public void delRicercatore() {
        areaIn = new Scanner(System.in);
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
        System.out.println("Ricercatore eliminato:\n" + ricercatoriLocali);
    }

    public void creaTeam() {
        areaIn = new Scanner(System.in);
        for (int i = 0; i < ricercatoriLocali.size(); i++) {
            if (ricercatoriLocali.get(i).isSenior()) System.out.print(i + ": " + ricercatoriLocali.get(i).toString());
        }
        int tempSenior;
        do {
            System.out.println("Scegli l'indice di un ricercatore senior come capo del team");
            tempSenior = areaIn.nextInt();
        } while (!ricercatoriLocali.get(tempSenior).isSenior());
        System.out.println();
        for (int i = 0; i < ricercatoriLocali.size(); i++) {
            if (!ricercatoriLocali.get(i).isInTeam()) System.out.print(i + ": " + ricercatoriLocali.get(i).toString());
        }
        String temp = "n";
        int indexRicercatore = 0;
        List<Ricercatore> tempList = new ArrayList<>();
        do {
            areaIn = new Scanner(System.in);
            System.out.println("Inserisci l'indice di un ricercatore per il team");
            indexRicercatore = areaIn.nextInt();
            if (!ricercatoriLocali.get(indexRicercatore).inTeam) {
                ricercatoriLocali.get(indexRicercatore).setInTeam(true);
                tempList.add(ricercatoriLocali.get(indexRicercatore));
                System.out.println("Vuoi inserire un'altro ricercatore? S/N?");
                areaIn = new Scanner(System.in);
                temp = areaIn.nextLine();
            } else {
                System.out.println("Il ricercatore scelto è gia in un team");
                temp = "s";
            }
        } while (temp.equals("s") || temp.equals("S"));
        try {
            teamLocali.add(new TeamRicerca(ricercatoriLocali.get(tempSenior), tempList.toArray(new Ricercatore[0])));
        } catch (Exception e) {
            System.out.println("Error\nValore invalido in creaTeam() " + getClass());
            return;
        }
        System.out.println("Team creato:\n" + teamLocali.get(teamLocali.size() - 1));
    }

    public void delTeam() {
        areaIn = new Scanner(System.in);
        if (teamLocali.isEmpty()) {
            System.out.println("Non ci sono team nell'area");
            return;
        }
        System.out.println(teamLocali.toString());
        System.out.println("Scegli l'indice del team da eliminare");
        int teamDaEliminare = areaIn.nextInt();
        if (teamLocali.get(teamDaEliminare).getProgettoCorrente() != null){
            System.out.println("Il team sta ricercando " + teamLocali.get(teamDaEliminare).getProgettoCorrente() + ", togli il progetto dal team prima di eliminarlo");
            return;
        }
        try {
            ricercatoriLocali.remove(teamDaEliminare);
        } catch (Exception e) {
            System.out.println("Error\nValore invalido in delTeam() " + getClass());
            return;
        }
        System.out.println("Team eliminato:\n" + teamLocali);
    }

    public String toString() {
        return "Area { " +
                "\nResponsabile = " + responsabile +
                "Team locali = " + teamLocali +
                "\nRicercatori locali = \n" + ricercatoriLocali +
                "\n}\n";
    }
}
