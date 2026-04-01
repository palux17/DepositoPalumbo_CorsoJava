public class Cravatta extends ComponenteFinitura {

    //Attributi + construttori
    private double larghezza;
    public Cravatta(String codice, String nome, String materiale, String colore, double prezzo, double larghezza) {
        super(codice, nome, materiale, colore, prezzo);
        this.larghezza = larghezza;
    }

    //ToString
    public String toString() {
        return super.toString() + " - Larghezza: " + larghezza;
    }
}