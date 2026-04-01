public class Pantalone extends CapoPrincipale {

    //Attributi + construttori
    private String tipoTaglio;
    public Pantalone(String codice, String nome, String tessuto, String colore, String taglia, double prezzo, String tipoTaglio) {
        super(codice, nome, tessuto, colore, taglia, prezzo);
        this.tipoTaglio = tipoTaglio;
    }

    //ToString
    public String toString() {
        return super.toString() + " - Taglio: " + tipoTaglio;
    }
}