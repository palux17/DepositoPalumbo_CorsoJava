import java.util.ArrayList;

public class StazioneSpaziale {

    //Attributi
    private ArrayList<String> esperimenti = new ArrayList<>();
    private ArrayList<Integer> valutazioni = new ArrayList<>();
    
    //Getter setter e costruttori
    public ArrayList<String> getEsperimenti() {
        return esperimenti;
    }
    public void setEsperimenti(ArrayList<String> esperimenti) {
        this.esperimenti = esperimenti;
    }
    public ArrayList<Integer> getValutazioni() {
        return valutazioni;
    }
    public void setValutazioni(ArrayList<Integer> valutazioni) {
        this.valutazioni = valutazioni;
    }
    public void aggiungiEsperimento(String esperimento) {
        esperimenti.add(esperimento);
        System.out.println("Esperimento aggiunto con successo.");
    }


    public StazioneSpaziale(ArrayList<String> esperimenti, ArrayList<Integer> valutazioni) {
        this.esperimenti = esperimenti;
        this.valutazioni = valutazioni;
    }
    public StazioneSpaziale() {
    }

    public void aggiungiValutazione(int valutazione) {
        if (valutazione >= 1 && valutazione <= 5) {
            valutazioni.add(valutazione);
            System.out.println("Valutazione aggiunta con successo.");
        } else {
            System.out.println("Valutazione non valida. Inserire un numero da 1 a 5.");
        }
    }

    public void stampaEsperimenti() {
        if (esperimenti.isEmpty()) {
            System.out.println("Nessun esperimento presente.");
        } else {
            System.out.println("Elenco esperimenti:");
            for (int i = 0; i < esperimenti.size(); i++) {
                System.out.println((i + 1) + ". " + esperimenti.get(i));
            }
        }
    }

    public void stampaValutazioni() {
        if (valutazioni.isEmpty()) {
            System.out.println("Nessuna valutazione presente.");
        } else {
            System.out.println("Elenco valutazioni:");
            for (int i = 0; i < valutazioni.size(); i++) {
                System.out.println((i + 1) + ". " + valutazioni.get(i));
            }
        }
    }
    

    
}
