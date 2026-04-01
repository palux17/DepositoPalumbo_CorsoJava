public class CapoPrincipale {

    //Attributi + construttori
    private String codice;
    private String nome;
    private String tessuto;
    private String colore;
    private String taglia;
    private double prezzo;
    public CapoPrincipale(String codice, String nome, String tessuto, String colore, String taglia, double prezzo) {
        this.codice = codice;
        this.nome = nome;
        this.tessuto = tessuto;
        this.colore = colore;
        this.taglia = taglia;
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String toString() {
        return nome + " (" + codice + ") - " + prezzo + "€";
    }
}