//Implementazione strategy
public class SpedizioneStandard implements StrategiaSpedizione {
    public void eseguiSpedizione() {
        System.out.println("Spedizione standard (5 giorni)");
    }
}