public class Libro {

    //Attributo libro
    private String titolo;
    private String autore;
    private double prezzo;
    private int codice;

    //Attributo statico di libro
    private static int contatore = 1;

    // Costruttore
    public Libro(String titolo, String autore, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
        this.codice = contatore++;
    }

    // Metodo per stampare i dettagli
    public void stampaDettagli() {
        System.out.println("Codice: " + codice + "\nTitolo: " + titolo + "\nAutore: " + autore + "\nPrezzo: " + prezzo + " euro");
    }
}