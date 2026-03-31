public class IspettoreEsperto extends Ispettore {

    // Costruttore
    public IspettoreEsperto(String nome, String email) {
        super(nome, email);
    }

    //Visualizzare tutte le valutazioni
    public void visualizzaValutazioni(StazioneSpaziale stazione) {
        System.out.println("Valutazioni presenti nella stazione:");
        stazione.stampaValutazioni();
    }
}
