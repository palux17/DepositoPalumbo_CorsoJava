public class Giacca extends CapoPrincipale {

    //Attributi + construttori
    private int numeroBottoni;
    public Giacca(String codice, String nome, String tessuto, String colore, String taglia, double prezzo, int numeroBottoni) {
        super(codice, nome, tessuto, colore, taglia, prezzo);
        this.numeroBottoni = numeroBottoni;
    }

    //ToString
    public String toString() {
        return super.toString() + " - Bottoni: " + numeroBottoni;
    }
}
