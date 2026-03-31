public class Ispettore extends Astronauta {

    // Costruttore
    public Ispettore(String nome, String email) {
        super(nome, email);
    }

    //Aggiunge valutazione
    public void valutaEsperimento(StazioneSpaziale stazione, int valutazione) {
        stazione.aggiungiValutazione(valutazione);
        System.out.println(getNome() + " ha inserito una valutazione.");
    }
    
}
