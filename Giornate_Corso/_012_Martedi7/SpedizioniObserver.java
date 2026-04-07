public class SpedizioniObserver implements ObserverOrdine {

    @Override
    public void aggiorna(Ordine ordine) {
        if (ordine.getStato().equalsIgnoreCase("SPEDITO")) {
            System.out.println("[SPEDIZIONI] L'ordine ID " + ordine.getId() + " è pronto per la spedizione.");
        }
    }
}