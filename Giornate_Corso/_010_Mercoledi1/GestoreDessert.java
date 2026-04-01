import java.util.ArrayList;

public class GestoreDessert {

    //Attributi + Costruttore
    private ArrayList<Dessert> desserts;
    public GestoreDessert() {
        desserts = new ArrayList<>();
    }

    //Aggiunge dessert
    public void aggiungiDessert(Dessert dessert) {
        desserts.add(dessert);
    }

    //Prepara dessert
    public void preparaDessert() {
        if (desserts.isEmpty()) {
            System.out.println("Nessun dessert presente.");
            return;
        }
        System.out.println("Preparazione dessert:");
        for (Dessert d : desserts) {
            System.out.println("Dessert: " + d.getNome());
            d.prepara();
        }
    }
}
