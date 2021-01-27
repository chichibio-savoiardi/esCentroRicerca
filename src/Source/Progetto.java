package Source;

import java.lang.String;
import java.util.Arrays;

import lombok.Data;

public @Data class Progetto {
    private String nome;
    private String tipo;
    private double budget;
    private String cliente;

    public Progetto(String nome, String tipo, double budget, String cliente) {
        this.nome = nome;
        this.tipo = tipo;
        this.budget = budget;
        this.cliente = cliente;
    }
}
