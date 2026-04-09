//Implementazione strategy
public class SpedizioneEspressa implements StrategiaSpedizione {
    public void eseguiSpedizione() {
        System.out.println("Spedizione espressa (1 giorno)");
    }
}