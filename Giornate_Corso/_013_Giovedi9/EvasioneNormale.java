//Implementazione strategy
public class EvasioneNormale implements StrategiaEvasione {
    @Override
    public void eseguiEvasione(Ordine ordine) {
        double prezzoFinale = ordine.getPrezzo() * 1.05;
        System.out.println("Evasione Normale\nPrezzo finale: " + prezzoFinale);
    }
}