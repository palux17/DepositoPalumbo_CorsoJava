public class Furgone extends VeicoloConsegna implements Tracciabile {

    //Costruttore
    public Furgone(String targa, float caricoMassimo) {
        super(targa, caricoMassimo);
    }

    //Override metodo astratto
    @Override
    public void consegnaPacco(String destinazione) {
        System.out.println("Il furgone con targa " + targa + " sta consegnando via strada verso " + destinazione);
    }

    //Implementazione interfaccia
    @Override
    public void tracciaConsegna(String codiceTracking) {
        System.out.println("Tracking furgone [" + codiceTracking + "]: spedizione in transito su strada.");
    }
}