import java.util.ArrayList;

public class Outfit {

    //Attributi + construttori
    private ArrayList<CapoPrincipale> capi;
    private ArrayList<ComponenteFinitura> componenti;
    public Outfit() {
        capi = new ArrayList<>();
        componenti = new ArrayList<>();
    }

    //Aggiunge robe
    public void aggiungiCapo(CapoPrincipale capo) {
        capi.add(capo);
    }
    public void aggiungiComponente(ComponenteFinitura comp) {
        componenti.add(comp);
    }

    //Calcolo prezzo
    public double calcolaPrezzoTotale() {
        double totale = 0;
        for (CapoPrincipale c : capi) {
            totale += c.getPrezzo();
        }
        for (ComponenteFinitura c : componenti) {
            totale += c.getPrezzo();
        }
        return totale;
    }

    //Stampa
    public void stampaOutfit() {
        System.out.println("Capi:");
        for (CapoPrincipale c : capi) {
            System.out.println(c);
        }
        System.out.println("Componenti:");
        for (ComponenteFinitura c : componenti) {
            System.out.println(c);
        }
        System.out.println("Totale: " + calcolaPrezzoTotale() + "euro");
    }
}