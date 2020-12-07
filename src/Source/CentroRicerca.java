package Source;

import JavaUtils.BasicUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CentroRicerca {
    private Scanner centroIn;
    protected Area[] listaAree;
    private int areaCorrente;
    private List<Progetto> progetti;

    public CentroRicerca() {
        this.centroIn = new Scanner(System.in);
        this.listaAree = new Area[10];
        initListaAree();
        this.areaCorrente = 0;
        this.progetti = new ArrayList<>();
    }

    private void initListaAree() {
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
            tempArray[i] = new Ricercatore(names[i], true);
        }
        for (int i = 0; i < listaAree.length; i++) {
            listaAree[i] = new Area(tempArray[i]);
        }
    }

    // +++++ getter / setter +++++

    public int getAreaCorrente() {
        return areaCorrente;
    }

    public void setAreaCorrente(int areaCorrente) {
        this.areaCorrente = areaCorrente;
    }

    // ----- end getter / setter -----

    public void gestoreCentro() {
        System.out.println("+++++\nArea corrente: " + areaCorrente);
        System.out.print("Responsabile area: " + listaAree[areaCorrente].getResponsabile());
        System.out.println("""
                -----
                Premi 1 per assegnare un progetto
                premi 2 per finire un progetto
                premi 3 per vedere la lista dei progetti
                premi 4 per vedere la lista dei ricercatori e gestirli
                premi 5 per vedere la lista dei team e gestirli
                premi 9 per cambiare area
                Premi 0 per uscire
                +++++""");
        int gestoreCentroSwitchVar = centroIn.nextInt();
        switch (gestoreCentroSwitchVar) {
            case 0 -> System.exit(2);
            case 1 -> creaProgetto();
            case 2 -> delProgetto();
            case 3 -> System.out.println(progetti.toString());
            case 4 -> gestoreRicercatori();
            case 5 -> gestoreTeam();
            case 9 -> {
                System.out.println("Inserisci il numero area da 0 a 9");
                areaCorrente = centroIn.nextInt();
            }
            default -> gestoreCentro();
        }
        gestoreCentro();
    }

    public void gestoreRicercatori() {
        System.out.println(listaAree[areaCorrente].getRicercatoriLocali());
    }

    public void gestoreTeam() {
        System.out.println(listaAree[areaCorrente].getTeamLocali());
        int gestoreTeamSwitchVar = centroIn.nextInt();
        switch (gestoreTeamSwitchVar) {
            case 0 -> gestoreCentro();
            //todo
            default -> gestoreTeam();
        }
    }

    public void creaProgetto() {
        if (listaAree[areaCorrente].getTeamLocali().isEmpty()) {
            System.out.println("Non ci sono team nell'area selezionata");
            return;
        }
        System.out.println("Inserisci il nome del progetto");
        String tempNome = centroIn.nextLine();
        System.out.println("A quale team lo vuoi assegnare");
        System.out.println(listaAree[areaCorrente].getTeamLocali());
        try {
            progetti.add(new Progetto(tempNome, listaAree[areaCorrente].getTeamLocali().get(centroIn.nextInt())));
        } catch (Exception e) {
            System.out.println("Error\nValore invalido");
            gestoreCentro();
        }
    }

    public void delProgetto() {
        System.out.println(progetti.toString());
        System.out.println("Scegli il progetto da eliminare");
        try {
            progetti.remove(centroIn.nextInt());
        } catch (Exception e) {
            System.out.println("Error\nValore invalido");
            gestoreCentro();
        }
    }

    public String toString() {
        return "Centro Ricerca { " +
                "\nArea corrente = " + areaCorrente +
                "\nLista aree = " + Arrays.toString(listaAree) +
                "\nLista progetti = " + progetti +
                "\n}\n";
    }
}
