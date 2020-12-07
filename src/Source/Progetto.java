package Source;

public class Progetto {
    protected TeamRicerca assegnatoA;
    protected String nome;

    public Progetto(String nome, TeamRicerca assegnatoA) {
        this.assegnatoA = assegnatoA;
        this.nome = nome;
    }

    public String toString() {
        return "Progetto{" +
                "assegnato A = " + assegnatoA +
                ", nome = '" + nome + '\'' +
                '}';
    }
}
