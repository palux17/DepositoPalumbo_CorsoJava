public class Papillon extends ComponenteFinitura {

    //Attributi + construttori
    private String tipoChiusura;
    public Papillon(String codice, String nome, String materiale, String colore, double prezzo, String tipoChiusura) {
        super(codice, nome, materiale, colore, prezzo);
        this.tipoChiusura = tipoChiusura;
    }

    //ToString
    public String toString() {
        return super.toString() + " - Chiusura: " + tipoChiusura;
    }
}