import java.util.ArrayList;

public class GestoreOrdini {

    //Attributi
    private ArrayList<Hamburger> ordini;

    //Costruttore
    public GestoreOrdini() {
        ordini = new ArrayList<>();
    }

    //Aggiunge hamburger
    public void aggiungiOrdine(Hamburger hamburger) {
        ordini.add(hamburger);
    }

    //Prepara hamburger
    public void preparaOrdini() {
        if (ordini.isEmpty()) {
            System.out.println("Nessun ordine presente.");
            return;
        }
        System.out.println("Preparazione ordini:\n");
        for (Hamburger h : ordini) {
            System.out.println("Ordine: " + h.getNome());
            h.prepara();
        }
    }
}