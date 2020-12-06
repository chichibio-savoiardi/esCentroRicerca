package Source;

import java.util.Scanner;

public class CentroRicerca {
    private Scanner centroIn;
    private Area[] listaAree;
    private int areaCorrente;

    public CentroRicerca() {
        this.centroIn = new Scanner(System.in);
        this.listaAree = new Area[10];
        this.areaCorrente = 0;
    }

    public int getAreaCorrente() {
        return areaCorrente;
    }

    public void setAreaCorrente(int areaCorrente) {
        this.areaCorrente = areaCorrente;
    }
}
