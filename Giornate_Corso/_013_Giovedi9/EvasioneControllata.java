//Implementazione strategy
public class EvasioneControllata implements StrategiaEvasione {
    @Override
    public void eseguiEvasione(Ordine ordine) {
        double prezzoFinale = ordine.getPrezzo() * 0.95;
        System.out.println("EvasioneControllata\nPrezzo finale: " + prezzoFinale);
    }
}