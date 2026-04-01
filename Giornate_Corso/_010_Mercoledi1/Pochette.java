public class Pochette extends ComponenteFinitura {

    //Attributi + construttori
    private String piegaDecorativa;
    public Pochette(String codice, String nome, String materiale, String colore, double prezzo, String piegaDecorativa) {
        super(codice, nome, materiale, colore, prezzo);
        this.piegaDecorativa = piegaDecorativa;
    }

    //ToString
    public String toString() {
        return super.toString() + " - Piega: " + piegaDecorativa;
    }
}