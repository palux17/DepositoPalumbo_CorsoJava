import java.util.ArrayList;

public class CentroPriorita {

    //Attributi (tra cui observer)
    private String statoOperativo;
    private ArrayList<Observer> observers;

    //Costruttore + getter e setter
    public CentroPriorita() {
        observers = new ArrayList<>();
        statoOperativo = "normale";
    }
    public void setStatoOperativo(String statoOperativo) {
        this.statoOperativo = statoOperativo;
        System.out.println("CentroPriorita: stato cambiato in " + statoOperativo);
        notificaObserver();
    }
    public String getStatoOperativo() {
        return statoOperativo;
    }

    //Gestione observer
    public void registraObserver(Observer observer) {
        observers.add(observer);
    }
    public void rimuoviObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notificaObserver() {
        for (Observer observer : observers) {
            observer.aggiorna(statoOperativo);
        }
    }

    
}