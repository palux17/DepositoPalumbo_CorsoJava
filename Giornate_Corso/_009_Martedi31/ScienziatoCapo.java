public class ScienziatoCapo extends Scienziato {

    //Costruttore
    public ScienziatoCapo(String nome, String email) {
        super(nome, email);
    }

    //Visualizza tutti gli esperimenti
    public void visualizzaEsperimenti(StazioneSpaziale stazione) {
        System.out.println("Esperimenti presenti nella stazione:");
        stazione.stampaEsperimenti();
    }
}
