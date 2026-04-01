public class Gilet extends CapoPrincipale {
    //Attributi + construttori
    private boolean reverPresente;
    public Gilet(String codice, String nome, String tessuto, String colore, String taglia, double prezzo, boolean reverPresente) {
        super(codice, nome, tessuto, colore, taglia, prezzo);
        this.reverPresente = reverPresente;
    }

    //ToString
    public String toString() {
        return super.toString() + " - Rever: " + reverPresente;
    }
}
