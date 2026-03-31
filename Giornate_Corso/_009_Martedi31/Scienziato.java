public class Scienziato extends Astronauta {

    //Costruttore
    public Scienziato(String nome, String email) {
        super(nome, email);
    }

    //Aggiunge esperimento
    public void eseguiEsperimento(StazioneSpaziale stazione, String esperimento) {
        stazione.aggiungiEsperimento(esperimento);
        System.out.println(getNome() + " ha aggiunto un esperimento.");
    }
    
}
