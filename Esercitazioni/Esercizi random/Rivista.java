public class Rivista extends ContenutoDigitale {

    //Attributi
    private int edizione;
    private String meseUscita;
    
    //Costruttore
    public Rivista(int codiceIdentificativo, int annoPublicazione, String titolo, String autore, boolean disponibile, int edizione, String meseUscita) {
        super(codiceIdentificativo, annoPublicazione, titolo, autore, disponibile);
        this.edizione = edizione;
        this.meseUscita = meseUscita;
    }

    //Getter e setter
    public int getEdizione() {
        return edizione;
    }
    public void setEdizione(int edizione) {
        this.edizione = edizione;
    }
    public String getMeseUscita() {
        return meseUscita;
    }
    public void setMeseUscita(String meseUscita) {
        this.meseUscita = meseUscita;
    }

    //toString
    @Override
    public String toString() {
        return "Rivista [edizione=" + edizione + ", meseUscita=" + meseUscita + "]";
    }
}
