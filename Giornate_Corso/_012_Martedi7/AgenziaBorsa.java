import java.util.ArrayList;
import java.util.List;

public class AgenziaBorsa {

    //Attributi + costruttori 
    private List<Investitore> investitori;
    public AgenziaBorsa() {
        investitori = new ArrayList<>();
    }

    //Aggiunge un investitore
    public void aggiungiInvestitore(Investitore investitore) {
        investitori.add(investitore);
        System.out.println("Investitore aggiunto con successo.");
    }

    //Rimuove un investitore
    public void rimuoviInvestitore(Investitore investitore) {
        investitori.remove(investitore);
        System.out.println("Investitore rimosso con successo.");
    }

    //Notifica tutti gli investitori
    public void notificaInvestitori(String azione, double valore) {
        for (Investitore investitore : investitori) {
            investitore.notifica(azione, valore);
        }
        System.out.println("\n");
    }

    //Aggiorna il valore dell'azione e notifica
    public void aggiornaValoreAzione(String nome, double valore) {
        System.out.println("Aggiornamento azione: " + nome + " -> " + valore + " euro");
        notificaInvestitori(nome, valore);
    }
}