public class Veicolo {

    //Attributi di veicolo
    String marca;
    String modello;
    int anno;
    double prezzo;
    boolean aggiunto = false;

    //Inserimento dati veicolo solo con prezzo positivo e annata maggiore 1900
    public void inserisciDati(String marca, String modello, int anno, double prezzo) {
        if (prezzo > 0 && anno > 1900) {
            this.marca = marca;
            this.modello = modello;
            this.anno = anno;
            this.prezzo = prezzo;
            this.aggiunto = true;
            System.out.println("Veicolo inserito correttamente.");
        } 
        else if (prezzo <= 0){
            System.out.println("Il prezzo deve essere positivo.");
        }
        else{
            System.out.println("L'anno deve essere maggiore del 1900");
        }
    }

    //Stampa delle info del veicolo se presente
    public void visualizzaVeicolo() {
        if (!aggiunto) {
            System.out.println("Il veicolo non è presente");
            return;
        }
        System.out.println("Marca: " + marca + "\nModello: " + modello + "\nAnno: " + anno +"\nPrezzo: " + prezzo + " euro");
    }

    //Modifica prezzo se veicolo presente e se prezzo positivo
    public void modificaPrezzo(double nuovoPrezzo) {
        if (!aggiunto) {
            System.out.println("Il veicolo non è presente");
            return;
        }

        if (nuovoPrezzo > 0) {
            prezzo = nuovoPrezzo;
            System.out.println("Prezzo aggiornato.");
        } else {
            System.out.println("Il nuovo prezzo deve essere maggiore di zero");
        }
    }

    //Calcolo età del veicolo se presente e stampo quanto nuovo sia
    public void verificaEtaVeicolo() {
        if (!aggiunto) {
            System.out.println("Il veicolo non è presente");
            return;
        }
        int eta = 2026 - anno;
        if (eta < 5) {
            System.out.println("Il veicolo è nuovo");
        } else if (eta <= 15) {
            System.out.println("Il veicolo è usato");
        } else {
            System.out.println("Il veicolo è vecchio");
        }
    }
}
