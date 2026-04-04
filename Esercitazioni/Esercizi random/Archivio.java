import java.util.ArrayList;

public class Archivio {
    
    private ArrayList<ContenutoDigitale> biblioteca;
    private ArrayList<ContenutoDigitale> prestiti;

    public Archivio(ArrayList<ContenutoDigitale> biblioteca, ArrayList<ContenutoDigitale> prestiti) {
        this.biblioteca = biblioteca;
        this.prestiti = prestiti;
    }

    public ArrayList<ContenutoDigitale> getBiblioteca() {
        return biblioteca;
    }
    public void setBiblioteca(ArrayList<ContenutoDigitale> biblioteca) {
        this.biblioteca = biblioteca;
    }

    /* 
    public void aggiungiContenuto(){
        for (ContenutoDigitale contenutoDigitale : biblioteca) {
            if
        }

        if (biblioteca.contains(c)){
            System.out.println("Errore. Il contenuto è già presente nell'archivio.");
            return;
        }
        biblioteca.add(c);
        System.out.println("Contenuto aggiunto correttamente.");
    }
    */

    public void rimuoviContenuto(int c){
        for (ContenutoDigitale contenutoDigitale : prestiti) {
            if(contenutoDigitale.getCodiceIdentificativo()==c){
                System.out.println("Impossibile rimuovere il contenuto perché attualmente in prestito.");
                return;
            }
        }
        for (ContenutoDigitale contenutoDigitale : biblioteca) {
            if(contenutoDigitale.getCodiceIdentificativo()==c){
                biblioteca.remove(contenutoDigitale);
                System.out.println("Contenuto rimosso correttamente.");
                return;
            }
        }
        System.out.println("Errore. Il contenuto non è presente nell'archivio.");
    }

    public void stampaArchivio(){
        System.out.println("----------------------- ARCHIVIO -----------------------\n");
        for (ContenutoDigitale contenutoDigitale : biblioteca) {
            System.out.println(contenutoDigitale);
        }
        System.out.println("--------------------------------------------------------\n");
    }

    public void stampaPrestiti(){
        System.out.println("----------------------- PRESTITI -----------------------\n");
        for (ContenutoDigitale contenutoDigitale : prestiti) {
            System.out.println(contenutoDigitale);
        }
        System.out.println("--------------------------------------------------------\n");
    }


    public void contenutoPresente(int c){
        for (ContenutoDigitale contenutoDigitale : biblioteca) {
            if (contenutoDigitale.getCodiceIdentificativo()==c){
                System.out.println("Il contenuto associato al codice identificativo " + c + " è presente nel nostro archivio.");
                return;
            }
        }
        for (ContenutoDigitale contenutoDigitale : prestiti) {
            if (contenutoDigitale.getCodiceIdentificativo()==c){
                System.out.println("Il contenuto associato al codice identificativo " + c + " è attualmente in prestito.");
                return;
            }
        }
        System.out.println("Il contenuto associato al codice identificativo " + c + " non è presente.");
    }

    public void prestaContenuto(String nome){
        for (ContenutoDigitale contenutoDigitale : prestiti) {
            if (contenutoDigitale.getTitolo().equals(nome)){
                System.out.println("Il contenuto è attualmente già in prestito.");
                return;
            }
        }
        for (ContenutoDigitale contenutoDigitale : biblioteca) {
            if (contenutoDigitale.getTitolo().equals(nome)){
                prestiti.add(contenutoDigitale);
                biblioteca.remove(contenutoDigitale);
                System.out.println("Ecco a lei il contenuto scelto.");
                return;
            }
        }
        System.out.println("Contenuto non presente in archivio.");
    }

    public void restituisciContenuto(String nome){
        for (ContenutoDigitale contenutoDigitale : prestiti) {
            if (contenutoDigitale.getTitolo().equals(nome)){
                biblioteca.add(contenutoDigitale);
                prestiti.remove(contenutoDigitale);
                System.out.println("Grazie e buona giornata!");
                return;
            }
        }
        System.out.println("Questo contenuto non appartiene a noi.");
    }

    public void stampaInfo(){
        System.out.println("=================== CONTENUTI ===================\n");
        stampaArchivio();
        stampaPrestiti();
    }

    @Override
    public String toString() {
        return "Archivio [biblioteca=" + biblioteca + ", prestiti=" + prestiti + "]";
    }
    
    


    


    
    
    
    

}
