public class Drone extends VeicoloConsegna implements Tracciabile {

    //Costruttore
    public Drone(String targa, float caricoMassimo) {
        super(targa, caricoMassimo);
    }

    //Override metodo astratto
    @Override
    public void consegnaPacco(String destinazione) {
        System.out.println("Il drone con codice " + targa + " sta volando verso " + destinazione);
    }

    //Implementazione interfaccia
    @Override
    public void tracciaConsegna(String codiceTracking) {
        System.out.println("Tracking drone [" + codiceTracking + "]: posizione rilevata automaticamente in volo.");
    }
}