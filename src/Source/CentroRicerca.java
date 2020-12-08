package Source;

import JavaUtils.BasicUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CentroRicerca {
    private Scanner centroIn;
    private Area[] listaAree;
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

    public Area[] getListaAree() {
        return listaAree;
    }

    public void setListaAree(Area[] listaAree) {
        this.listaAree = listaAree;
    }

    // ----- end getter / setter -----

    public void gestoreCentro() {
        System.out.println("+++++\nArea corrente: " + areaCorrente);
        System.out.println("Responsabile area: " + listaAree[areaCorrente].getResponsabile());
        System.out.println("""
                -----
                Premi 1 per assegnare un progetto
                premi 2 per finire un progetto
                premi 3 per vedere la lista dei progetti
                premi 4 per vedere la lista dei ricercatori e gestirli
                premi 5 per vedere la lista dei team e gestirli
                premi 8 per cambiare il responsabile area
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
            case 8 -> cambiaResponsabile();
            case 9 -> {
                System.out.println("Inserisci il numero area da 0 a 9");
                areaCorrente = centroIn.nextInt();
            }
            default -> gestoreCentro();
        }
        gestoreCentro();
    }

    public void gestoreRicercatori() {
        centroIn = new Scanner(System.in);
        for (int i = 0; i < listaAree[areaCorrente].getRicercatoriLocali().size(); i++) {
            System.out.println(i + ": " + listaAree[areaCorrente].getRicercatoriLocali().get(i));
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
            case 1 -> listaAree[areaCorrente].creaRicercatore();
            case 2 -> listaAree[areaCorrente].delRicercatore();
            default -> gestoreTeam();
        }
        gestoreCentro();
    }

    public void gestoreTeam() {
        centroIn = new Scanner(System.in);
        for (int i = 0; i < listaAree[areaCorrente].getTeamLocali().size(); i++) {
            System.out.println(i + ": " + listaAree[areaCorrente].getTeamLocali().get(i));
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
            case 1 -> listaAree[areaCorrente].creaTeam();
            case 2 -> listaAree[areaCorrente].delTeam();
            default -> gestoreTeam();
        }
        gestoreCentro();
    }

    public void creaProgetto() {
        centroIn = new Scanner(System.in);
        if (listaAree[areaCorrente].getTeamLocali().isEmpty()) {
            System.out.println("Non ci sono team nell'area selezionata");
            return;
        }
        System.out.println("Inserisci il nome del progetto");
        String tempNome = centroIn.nextLine();
        for (int i = 0; i < listaAree[areaCorrente].getTeamLocali().size(); i++) {
            System.out.println(i + ": " + listaAree[areaCorrente].getTeamLocali().get(i));
        }
        System.out.println("A quale team lo vuoi assegnare");
        centroIn = new Scanner(System.in);
        int tempTeam = centroIn.nextInt();
        try {
            progetti.add(new Progetto(tempNome, listaAree[areaCorrente].getTeamLocali().get(tempTeam)));
        } catch (Exception e) {
            System.out.println("Error\nValore invalido in creaProgetto() " + getClass());
            return;
        }
        listaAree[areaCorrente].getTeamLocali().get(tempTeam).setProgettoCorrente(progetti.get(progetti.size() - 1));//assegna l'ultimo progetto creato al team scelto
        System.out.println("Progetto creato: " + progetti.get(progetti.size() - 1));//stampa il progetto
    }

    public void delProgetto() {
        centroIn = new Scanner(System.in);
        if (progetti.isEmpty()) {
            System.out.println("Non ci sono progetti in corso");
            return;
        }
        for (int i = 0; i < progetti.size(); i++) {
            System.out.println(i + ": " + progetti.get(i));
        }
        System.out.println("Scegli l'indice del progetto da eliminare");
        centroIn = new Scanner(System.in);
        int progettoDaEliminare = centroIn.nextInt();
        try {
            progetti.get(progettoDaEliminare).assegnatoA.setProgettoCorrente(null);
            progetti.remove(progettoDaEliminare);
        } catch (Exception e) {
            System.out.println("Error\nValore invalido in delProgetto() " + getClass());
            return;
        }
        System.out.println("Progetto eliminato:\n" + progetti);
    }

    public void cambiaResponsabile() {
        centroIn = new Scanner(System.in);
        System.out.println("Responsabile: " + listaAree[areaCorrente].getResponsabile());
        for (int i = 0; i < listaAree[areaCorrente].getRicercatoriLocali().size(); i++) {
            if (listaAree[areaCorrente].getRicercatoriLocali().get(i).isSenior()) System.out.print(i + ": " + listaAree[areaCorrente].getRicercatoriLocali().get(i).toString());
        }
        int tempSenior;
        do {
            System.out.println("Inserisci l'indice del nuovo responsabile");
            tempSenior = centroIn.nextInt();
        } while (!listaAree[areaCorrente].getRicercatoriLocali().get(tempSenior).isSenior());
        listaAree[areaCorrente].setResponsabile(listaAree[areaCorrente].getRicercatoriLocali().get(tempSenior));
        System.out.println("Nuovo responsabile: " + listaAree[areaCorrente].getResponsabile());
    }

    public String toString() {
        return "Centro Ricerca { " +
                "\nArea corrente = " + areaCorrente +
                "\nLista aree = " + Arrays.toString(listaAree) +
                "\nLista progetti = " + progetti +
                "\n}\n";
    }
}
