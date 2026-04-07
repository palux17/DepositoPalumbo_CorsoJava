public class Maino {
    public static void main(String[] args) {

        //Inizializzazione
        StazioneMeteo stazione = new StazioneMeteo();
        DisplayConsole console = new DisplayConsole();
        DisplayMobile mobile = new DisplayMobile();
        stazione.aggiungiDisplay(console);
        stazione.aggiungiDisplay(mobile);
        stazione.setTemperatura(22.5f);
        stazione.setTemperatura(18.0f);
        stazione.rimuoviDisplay(console);
        stazione.setTemperatura(30.2f);
    }
}