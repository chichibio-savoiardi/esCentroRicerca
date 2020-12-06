package Source;

import java.util.Arrays;
import java.util.Scanner;

public class CentroRicerca {
    private Scanner centroIn;
    private Area[] listaAree;
    private int areaCorrente;

    public CentroRicerca() {
        this.centroIn = new Scanner(System.in);
        this.listaAree = new Area[10];
        initListaAree();
        this.areaCorrente = 0;
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

    public void printAree() {
        for (int i = 0; i < listaAree.length; i++) {
            System.out.println("Area " + i + " Status: ");
            System.out.println(listaAree[i].toString());
        }
    }

    public String toString() {
        return "Centro Ricerca { " +
                "\nArea corrente = " + areaCorrente +
                "\nLista aree = " + Arrays.toString(listaAree) +
                "\n}\n";
    }
}
