import java.util.ArrayList;

public class GestoreOrdini {

    //Attributo + Costruttore
    private ArrayList<ObserverOrdine> observers;
    public GestoreOrdini() {
        observers = new ArrayList<>();
    }

    //Aggiungi observer
    public void aggiungiObserver(ObserverOrdine observer) {
        observers.add(observer);
    }

    //Rimuovi Observer
    public void rimuoviObserver(ObserverOrdine observer) {
        observers.remove(observer);
    }

    //Aggiorna observer
    public void notificaObservers(Ordine ordine) {
        for (ObserverOrdine observer : observers) {
            observer.aggiorna(ordine);
        }
    }
}