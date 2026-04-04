public class Audiolibro extends ContenutoDigitale {

    //Attributi
    private int durata;
    private String voceNarrante;

    //Costruttore
    public Audiolibro(int codiceIdentificativo, int annoPublicazione, String titolo, String autore, boolean disponibile, int durata, String voceNarrante) {
        super(codiceIdentificativo, annoPublicazione, titolo, autore, disponibile);
        this.durata = durata;
        this.voceNarrante = voceNarrante;
    }

    //Getter e Setter
    public int getDurata() {
        return durata;
    }
    public void setDurata(int durata) {
        this.durata = durata;
    }
    public String getVoceNarrante() {
        return voceNarrante;
    }
    public void setVoceNarrante(String voceNarrante) {
        this.voceNarrante = voceNarrante;
    }

    //toString
    @Override
    public String toString() {
        return "Audiolibro [durata=" + durata + ", voceNarrante=" + voceNarrante + "]";
    }  
}
