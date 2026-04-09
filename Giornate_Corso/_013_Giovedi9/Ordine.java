public class Ordine implements Observer {

    //Attributi (variabile strategy)
    private int id;
    private String cliente;
    private String prodotto;
    private double prezzo;
    private StrategiaEvasione strategiaCorrente;

    //Costruttore + getter e setter
    public Ordine(int id, String cliente, String prodotto, double prezzo) {
        this.id = id;
        this.cliente = cliente;
        this.prodotto = prodotto;
        this.prezzo = prezzo;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public void setStrategiaCorrente(StrategiaEvasione strategiaCorrente) {
        this.strategiaCorrente = strategiaCorrente;
    }

    public void eseguiStrategia() {
        if (strategiaCorrente != null) {
            strategiaCorrente.eseguiEvasione(this);
        } else {
            System.out.println("Nessuna strategia impostata.");
        }
    }

    //Stampa dati
    public void mostraDatiOrdine() {
        System.out.println("ID: " + id + "\nCliente: " + cliente + "\nProdotto: " + prodotto + "\nPrezzo base: " + prezzo);
    }

    //Aggiornamento dello stato
    @Override
    public void aggiorna(String stato) {
        if (stato.equalsIgnoreCase("normale")) {
            setStrategiaCorrente(new EvasioneNormale());
            System.out.println("Ordine aggiornato: strategia impostata su EVASIONE NORMALE");
        } else if (stato.equalsIgnoreCase("priorita")) {
            setStrategiaCorrente(new EvasionePrioritaria());
            System.out.println("Ordine aggiornato: strategia impostata su EVASIONE PRIORITARIA");
        } else if (stato.equalsIgnoreCase("controllo")) {
            setStrategiaCorrente(new EvasioneControllata());
            System.out.println("Ordine aggiornato: strategia impostata su EVASIONE CONTROLLATA");
        } else {
            System.out.println("Stato non riconosciuto.");
        }
    }
}