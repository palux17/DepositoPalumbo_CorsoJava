public class MagazzinoObserver implements ObserverOrdine {

    @Override
    public void aggiorna(Ordine ordine) {
        if (ordine.getStato().equalsIgnoreCase("IN PREPARAZIONE")) {
            System.out.println("[MAGAZZINO] L'ordine ID " + ordine.getId() + " è entrato in preparazione.");
        }
    }
}