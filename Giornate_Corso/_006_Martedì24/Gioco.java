public class Gioco {

    //Attributti
    private String titolo;
    private String genere;
    private double costoSviluppo;
    private String stato;

    //Costruttore
    public Gioco(String titolo, String genere, double costoSviluppo, String stato) {
        this.titolo = titolo;
        this.genere = genere;
        this.costoSviluppo = costoSviluppo;
        this.stato = stato;
    }

    //Getter + setter
    public String getTitolo() {
        return titolo;
    }
    public double getCostoSviluppo() {
        return costoSviluppo;
    }
    public String getStato() {
        return stato;
    }
    public void setStato(String stato) {
        this.stato = stato;
    }

    //Print
    public void mostraDati() {
        System.out.println("Ecco i dati:\nTitolo: " + titolo + "\nGenere: " + genere + "\nCosto sviluppo: " + 
                            costoSviluppo + "\nStato: " + stato);
    }
}