public class Libro extends ContenutoDigitale{

    //Attributi
    private String genere;
    private int numeroPagine;

    //Costruttore
    public Libro(int codiceIdentificativo, int annoPublicazione, String titolo, String autore, boolean disponibile, String genere, int numeroPagine) {
        super(codiceIdentificativo, annoPublicazione, titolo, autore, disponibile);
        this.genere = genere;
        this.numeroPagine = numeroPagine;
    }

    //Getter e Setter
    public String getGenere() {
        return genere;
    }
    public void setGenere(String genere) {
        this.genere = genere;
    }
    public int getNumeroPagine() {
        return numeroPagine;
    }
    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    //toString
    @Override
    public String toString() {
        return "Libro [genere=" + genere + ", numeroPagine=" + numeroPagine + "]";
    }   
}