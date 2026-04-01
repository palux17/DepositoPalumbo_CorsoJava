public class ComponenteFinitura {

    //Attributi + construttori
    private String codice;
    private String nome;
    private String materiale;
    private String colore;
    private double prezzo;
    public ComponenteFinitura(String codice, String nome, String materiale, String colore, double prezzo) {
        this.codice = codice;
        this.nome = nome;
        this.materiale = materiale;
        this.colore = colore;
        this.prezzo = prezzo;
    }

    //Getter
    public double getPrezzo() {
        return prezzo;
    }

    //ToString
    public String toString() {
        return nome + " (" + codice + ") - " + prezzo + "euro";
    }
}