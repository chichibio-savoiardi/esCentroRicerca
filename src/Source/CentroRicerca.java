package Source;

import JavaUtils.BasicUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CentroRicerca {
    private Scanner centroIn;
    private List<Area> aree;
    private List<Progetto> progetti;
    private int areaCorrente;
    private BasicUtils basicUtils = new BasicUtils();

    public CentroRicerca() {
        this.centroIn = new Scanner(System.in);
        this.aree = new ArrayList<>();
        this.progetti = new ArrayList<>();
        this.areaCorrente = 0;
        aree.add(new Area(new Responsabile(new String[]{"Iuri", "Antico"}), "Lobby"));
        initListaRicercatori();
    }

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
            if (basicUtils.randBool()) tempArray[i] = new Senior(names[i]);
            else tempArray[i] = new Junior(names[i]);
        }
        thisArea().getListaRicercatori().addAll(Arrays.asList(tempArray));
    }

    // +++++ getter / setter +++++

    public int getAreaCorrente() {
        return areaCorrente;
    }

    public void setAreaCorrente(int areaCorrente) {
        this.areaCorrente = areaCorrente;
    }

    public List<Area> getAree() {
        return aree;
    }

    public void setAree(List<Area> aree) {
        this.aree = aree;
    }

    public List<Progetto> getProgetti() {
        return progetti;
    }

    public void setProgetti(List<Progetto> progetti) {
        this.progetti = progetti;
    }

    // ----- end getter / setter -----

    public void gestoreCentro() {
        System.out.println("+++++\nArea corrente: " + thisArea());
        System.out.println("""
                -----
                Premi 1 per gestire i progetti
                premi 2 per gestire i ricercatori
                premi 3 per gestire i team
                premi 4 per gestire le aree
                Premi 0 per uscire
                +++++""");
        int gestoreCentroSwitchVar = centroIn.nextInt();
        switch (gestoreCentroSwitchVar) {
            case 0 -> System.exit(2);
            case 1 -> gestoreProgetti();
            case 2 -> gestoreRicercatori();
            case 3 -> gestoreTeam();
            case 4 -> gestoreAree();
            default -> gestoreCentro();
        }
        gestoreCentro();
    }

    public void gestoreProgetti() {
        centroIn = new Scanner(System.in);
        //todo
    }

    public void gestoreRicercatori() {
        centroIn = new Scanner(System.in);
        for (int i = 0; i < thisArea().getListaRicercatori().size(); i++) {
            System.out.println(i + ": " + thisArea().getListaRicercatori().get(i));
        }
        System.out.println("""
                -----
                Premi 1 per creare un ricercatore
                Premi 2 per eliminare un ricercatore
                premi 0 per tornare indietro
                +++++""");
        int gestoreRicercatoriSwitchVar = centroIn.nextInt();
        switch (gestoreRicercatoriSwitchVar) {
            case 0 -> gestoreCentro();
            case 1 -> creaRicercatore();
            case 2 -> delRicercatore();
            default -> gestoreTeam();
        }
        gestoreCentro();
    }

    public void gestoreTeam() {
        centroIn = new Scanner(System.in);
        for (int i = 0; i < thisArea().getListaTeam().size(); i++) {
            System.out.println(i + ": " + thisArea().getListaTeam().get(i));
        }
        System.out.println("""
                -----
                Premi 1 per creare un team
                Premi 2 per eliminare un team
                premi 0 per tornare indietro
                +++++""");
        int gestoreTeamSwitchVar = centroIn.nextInt();
        switch (gestoreTeamSwitchVar) {
            case 0 -> gestoreCentro();
            case 1 -> creaTeam();
            case 2 -> delTeam();
            default -> gestoreTeam();
        }
        gestoreCentro();
    }

    public void gestoreAree() {
        centroIn = new Scanner(System.in);
        //todo
    }

    public void creaProgetto() {
        //todo
    }

    public void delProgetto() {
        //todo
    }

    public void creaTeam() {
        //todo
    }

    public void delTeam() {
        //todo
    }

    public void creaRicercatore() {
        //todo
    }

    public void delRicercatore() {
        //todo
    }

    private Area thisArea() {
        return aree.get(areaCorrente);
    }

    public String toString() {
        return "Centro Ricerca { " +
                "\nArea corrente = " + areaCorrente +
                "\nLista aree = " + aree +
                "\nLista progetti = " + progetti +
                "\n}\n";
    }
}
