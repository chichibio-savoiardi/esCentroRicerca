package Source;

import MyUtils.BasicUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Area {
    private Scanner areaIn;
    private Responsabile responsabile;
    private String nome;
    private List<TeamRicerca> listaTeam;
    private List<Ricercatore> listaRicercatori;
    private BasicUtils BasicUtils = new BasicUtils();

    public Area(Responsabile responsabile, String nome) {
        this.areaIn = new Scanner(System.in);
        this.responsabile = responsabile;
        this.nome = nome;
        this.listaTeam = new ArrayList<>();
        this.listaRicercatori = new ArrayList<>();
    }

    // +++++ getter / setter +++++

    public Ricercatore getResponsabile() {
        return responsabile;
    }

    public void setResponsabile(Responsabile responsabile) {
        this.responsabile = responsabile;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ricercatore> getListaRicercatori() {
        return listaRicercatori;
    }

    public void setListaRicercatori(List<Ricercatore> listaRicercatori) {
        this.listaRicercatori = listaRicercatori;
    }

    public List<TeamRicerca> getListaTeam() {
        return listaTeam;
    }

    public void setListaTeam(List<TeamRicerca> listaTeam) {
        this.listaTeam = listaTeam;
    }

    // ----- end getter / setter -----

    public String toString() {
        return "Area " + "{ " +
                "Nome = " + nome +
                ", Responsabile = " + responsabile +
                "\nTeams = " + listaTeam +
                "\nRicercatori = " + listaRicercatori +
                " }";
    }
}
