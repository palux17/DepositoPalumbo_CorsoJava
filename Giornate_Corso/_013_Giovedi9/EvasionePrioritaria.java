//Implementazione strategy
public class EvasionePrioritaria implements StrategiaEvasione {
    @Override
    public void eseguiEvasione(Ordine ordine) {
        double prezzoFinale = ordine.getPrezzo() * 1.15;
        System.out.println("Evasione Prioritaria\nPrezzo finale: " + prezzoFinale);
    }
}