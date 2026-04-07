import java.util.ArrayList;
import java.util.List;

public class StazioneMeteo {

    //Attributi
    private List<Display> displays;
    private float temperatura;

    //Arraylist di diplay
    public StazioneMeteo() {
        displays = new ArrayList<>();
    }

    //Aggiugnge display
    public void aggiungiDisplay(Display display) {
        displays.add(display);
    }

    //Rimuove display
    public void rimuoviDisplay(Display display) {
        displays.remove(display);
    }

    //Per ciascun display aggiorna temperatura
    public void notificaDisplay() {
        for (Display display : displays) {
            display.aggiorna(temperatura);
        }
    }

    //Imposta temperatura
    public void setTemperatura(float t) {
        this.temperatura = t;
        System.out.println("La temperatura aggiornata è " + temperatura + "°C");
        notificaDisplay();
    }
}