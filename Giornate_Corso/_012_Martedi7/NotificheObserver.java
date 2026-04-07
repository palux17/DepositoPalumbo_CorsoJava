public class NotificheObserver implements ObserverOrdine {

    @Override
    public void aggiorna(Ordine ordine) {
        System.out.println("[NOTIFICHE] Cliente " + ordine.getNomeCliente() + " , il tuo ordine ID " + ordine.getId() + 
                            " ora è nello stato: " + ordine.getStato());
    }
}