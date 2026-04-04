public abstract class ContenutoDigitale {

    //Attributi
    private static int contatore;
    private int codiceIdentificativo, annoPublicazione;
    private String titolo, autore;
    private boolean disponibile;

    //Costruttore
    public ContenutoDigitale(int codiceIdentificativo, int annoPublicazione, String titolo, String autore, boolean disponibile) {
        this.codiceIdentificativo = contatore ++;
        this.annoPublicazione = annoPublicazione;
        this.titolo = titolo;
        this.autore = autore;
        this.disponibile = disponibile;
    }

    //Getter e Setter
    public int getCodiceIdentificativo() {
        return codiceIdentificativo;
    }
    public void setCodiceIdentificativo(int codiceIdentificativo) {
        this.codiceIdentificativo = codiceIdentificativo;
    }
    public int getAnnoPublicazione() {
        return annoPublicazione;
    }
    public void setAnnoPublicazione(int annoPublicazione) {
        this.annoPublicazione = annoPublicazione;
    }
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String getAutore() {
        return autore;
    }
    public void setAutore(String autore) {
        this.autore = autore;
    }
    public boolean isDisponibile() {
        return disponibile;
    }
    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    //toString
    @Override
    public String toString() {
        return "ContenutoDigitale [codiceIdentificativo=" + codiceIdentificativo + ", annoPublicazione="
                + annoPublicazione + ", titolo=" + titolo + ", autore=" + autore + ", disponibile=" + disponibile + "]";
    }    
}
