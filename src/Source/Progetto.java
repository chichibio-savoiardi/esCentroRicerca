package Source;

import java.lang.String;
import java.util.Arrays;

public class Progetto {
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

    // +++++ getter / setter +++++

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    // +++++ end getter / setter +++++

    public String toString() {
        return "Progetto { " +
                "Nome = '" + nome + '\'' +
                ", Tipo = '" + tipo + '\'' +
                ", Budget = " + budget +
                ", Cliente = '" + cliente + '\'' +
                " }";
    }
}
